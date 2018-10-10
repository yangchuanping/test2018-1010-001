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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IUserBiz;
import entrepreneurialcenter.office.dao.UserMapper;
import entrepreneurialcenter.office.pojo.User;
import entrepreneurialcenter.office.pojo.UserExample;
import entrepreneurialcenter.office.pojo.UserExample.Criteria;
import entrepreneurialcenter.office.pojo.impl.UserGpDep;
import entrepreneurialcenter.office.util.CookieUtils;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class UserBizImpl implements IUserBiz {

	private static String TT_TOKEN="MS_TOKEN";
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(new UserExample());
	}

	@Override
	public Integer getAllUserCount() {
		// TODO Auto-generated method stub
		return userMapper.countByExample(new UserExample());
	}

	@Override
	public String getUserById(Long id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(user);
	}

	@Override
	public Result addUser(User record) {
		// TODO Auto-generated method stub
		 int num = 1;
         double random = Math.random();
         if (random < 0.1) {
              random = random + 0.1;
         } for (int i = 0; i < 10; i++) {
              num = num * 10;
         }
		
		record.setUserId((long) (random * num));
		record.setCreated((int) (System.currentTimeMillis()/1000));
		
		record.setUserStatus("1");
		if (StringUtils.isBlank(record.getUserPass())) {
			record.setUserPass(DigestUtils.md5DigestAsHex("123456".getBytes()));
		}else{
			record.setUserPass(DigestUtils.md5DigestAsHex(record.getUserPass().getBytes()));
		}
		if (userMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delUser(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = userMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateUser(User record) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(record.getUserId());
		user.setUserName(record.getUserName());
		user.setGroupId(record.getGroupId());
		user.setUpdated((int) (System.currentTimeMillis()/1000));
		user.setUserCellphone(record.getUserCellphone());
		user.setUserDisplayname(record.getUserDisplayname());
		
		user.setUserPass(record.getUserPass());
		user.setUserTelephone(record.getUserTelephone());
		if (userMapper.updateByPrimaryKey(user) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public Result loginUser(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		//有效性验证
		if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
			return Result.build(400, "用户名和密码不能为空");
		}
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return Result.build(400, "用户名或密码错误");
		}
		//判断密码是否正确
		User user = list.get(0);
		if (user.getUserStatus().equals("2")) {
			return Result.build(400, "用户名或密码错误");
		}
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getUserPass())) {
			return Result.build(400, "用户名或密码错误");
		}
		
		//生成token
		UUID uuid = UUID.randomUUID();
		String token = uuid.toString();
		//把用户信息写入redis
		//把用户的密码清空，为了安全。
		user.setUserPass(null);
		//把token写入cookie
		CookieUtils.setCookie(request, response, TT_TOKEN, token);
		//返回token
		//return Result.ok(token);
		User u = new User();
		u.setUserDisplayname(user.getUserDisplayname());
		u.setGroupId(user.getGroupId());
		u.setUserId(user.getUserId());
		return Result.ok(u);
	}

	@Override
	public EasyUIDataGridResult getUserInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		//条件查询
		//UserExample example = new UserExample();
		//List<User> list = userMapper.selectByExampleWithBLOBs(example);
		//PageInfo<User> pageInfo = new PageInfo<>(list);
		
		List<UserGpDep> list = userMapper.selectUserGpDep();
		PageInfo<UserGpDep> pageInfo = new PageInfo<>(list);
		
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
		long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
		
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
		
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

	@Override
	public Result updateUserPass(Long id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		user.setUserPass(DigestUtils.md5DigestAsHex("123456".getBytes()));
		user.setUpdated((int) (System.currentTimeMillis()/1000));
		
		if (userMapper.updateByPrimaryKey(user) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public List<UserGpDep> getAllUserGpDepInfo() {
		// TODO Auto-generated method stub
		return userMapper.selectUserGpDep();
	}

}
