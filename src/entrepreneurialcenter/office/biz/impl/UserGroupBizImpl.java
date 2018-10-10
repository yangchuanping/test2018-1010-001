package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IUserGroupBiz;
import entrepreneurialcenter.office.dao.UserGroupMapper;
import entrepreneurialcenter.office.pojo.UserGroup;
import entrepreneurialcenter.office.pojo.UserGroupExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class UserGroupBizImpl implements IUserGroupBiz {

	@Autowired
	private UserGroupMapper userGroupMapper;
	
	@Override
	public List<UserGroup> getAllUserGroupInfo() {
		// TODO Auto-generated method stub
		return userGroupMapper.selectByExample(new UserGroupExample());
	}

	@Override
	public Integer getAllUserGroupCount() {
		// TODO Auto-generated method stub
		return userGroupMapper.countByExample(new UserGroupExample());
	}

	@Override
	public String getUserGroupById(Long id) {
		// TODO Auto-generated method stub
		UserGroup group = userGroupMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(group);
	}

	@Override
	public Result addUserGroup(UserGroup record) {
		// TODO Auto-generated method stub
		int num = 1;
        double random = Math.random();
        if (random < 0.1) {
             random = random + 0.1;
        } for (int i = 0; i < 10; i++) {
             num = num * 10;
        }
		record.setGroupId((long) (random * num));
		record.setCreated((int) (System.currentTimeMillis()/1000));
		record.setGroupStatus("1");
		if (userGroupMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delUserGroup(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = userGroupMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateUserGroup(UserGroup record) {
		// TODO Auto-generated method stub
		UserGroup group = userGroupMapper.selectByPrimaryKey(record.getGroupId());
		//group.setCreated(record.getCreated());
		group.setGroupName(record.getGroupName());
		group.setGroupRole(record.getGroupRole());
		group.setGroupStatus(record.getGroupStatus());
		group.setUpdated(record.getUpdated());
		
		if (userGroupMapper.updateByPrimaryKey(group) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
