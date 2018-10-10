package entrepreneurialcenter.office.biz.impl;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IUserFrontBiz;
import entrepreneurialcenter.office.dao.UserFrontMapper;
import entrepreneurialcenter.office.pojo.UserFront;
import entrepreneurialcenter.office.pojo.UserFrontExample;
import entrepreneurialcenter.office.util.CookieUtils;
import entrepreneurialcenter.office.util.Result;

@Service
public class UserFrontBizImpl implements IUserFrontBiz {
	
	private static String TT_TOKEN="MS_TOKEN";

	@Autowired
	private UserFrontMapper frontMappar;
	
	@Override
	public List<UserFront> getAllUserFrontInfo() {
		// TODO Auto-generated method stub
		return frontMappar.selectByExample(new UserFrontExample());
	}

	@Override
	public Integer getAllUserFrontCount() {
		// TODO Auto-generated method stub
		return frontMappar.countByExample(new UserFrontExample());
	}

	@Override
	public String getUserFrontById(Long id) {
		// TODO Auto-generated method stub
		return JSON.toJSONString(frontMappar.selectByPrimaryKey(id));
	}

	@Override
	public Result addUserFront(UserFront record) {
		// TODO Auto-generated method stub
		record.setFrontPass(DigestUtils.md5DigestAsHex("123456".getBytes()));
		record.setFrontStatus("1");
		record.setCreated((int) (System.currentTimeMillis()/1000));
		if (frontMappar.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}else{
			UserFrontExample example = new UserFrontExample();
			UserFrontExample.Criteria criteria = example.createCriteria();
			criteria.andFrontTelephoneEqualTo(record.getFrontTelephone());
			List<UserFront> list = frontMappar.selectByExample(example);
			UserFront userFront = list.get(0);
			return Result.ok(userFront.getFrontId());
		}
	}

	@Override
	public Result delUserFront(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = frontMappar.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateUserFront(UserFront record) {
		// TODO Auto-generated method stub
		UserFront userFront = frontMappar.selectByPrimaryKey(record.getFrontId());
		userFront.setFrontName(record.getFrontName());
		userFront.setFrontTelephone(record.getFrontTelephone());
		
		if (frontMappar.updateByPrimaryKey(userFront) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public Result getPhoneIsRepet(String value) {
		// TODO Auto-generated method stub
		UserFrontExample example = new UserFrontExample();
		UserFrontExample.Criteria criteria = example.createCriteria();
		criteria.andFrontTelephoneEqualTo(value);
		List<UserFront> list = frontMappar.selectByExample(example);
		if (list.size() == 0) {
			return Result.ok();
		}else{
			UserFront userFront = list.get(0);
			return Result.build(500, "手机号码重复！",userFront.getFrontId());
		}
		
	}

	@Override
	public Result loginUserFront(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("username:"+username+"password:"+password);
		//有效性验证
		if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			return Result.build(400, "用户名和密码不能为空");
		}
		UserFrontExample example = new UserFrontExample();
		UserFrontExample.Criteria criteria = example.createCriteria();
		criteria.andFrontTelephoneEqualTo(username);
		List<UserFront> list = frontMappar.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return Result.build(400, "用户名或密码错误");
		}
		UserFront userFront = list.get(0);
		if (userFront.getFrontStatus().equals("2")) {
			return Result.build(400, "用户名或密码错误");
		}
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(userFront.getFrontPass())) {
			return Result.build(400, "用户名或密码错误");
		}
		//生成token
		UUID uuid = UUID.randomUUID();
		String token = uuid.toString();
		//把用户信息写入redis
		//把用户的密码清空，为了安全。
		userFront.setFrontPass(null);
		//把token写入cookie
		CookieUtils.setCookie(request, response, TT_TOKEN, token);
		//返回token
		UserFront uf = new UserFront();
		uf.setFrontName(userFront.getFrontName());
		uf.setFrontTelephone(userFront.getFrontTelephone());
		uf.setFrontId(userFront.getFrontId());
		return Result.ok(uf);
	}

	@Override
	public Result updateUserFrontPass(Long id, String oldPass, String newPass) {
		// TODO Auto-generated method stub
		UserFront userFront = frontMappar.selectByPrimaryKey(id);
		if (!DigestUtils.md5DigestAsHex(oldPass.getBytes()).equals(userFront.getFrontPass())) {
			return Result.build(400, "旧密码错误。");
		}
		userFront.setFrontPass(DigestUtils.md5DigestAsHex(newPass.getBytes()));
		
		if (frontMappar.updateByPrimaryKey(userFront) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

}
