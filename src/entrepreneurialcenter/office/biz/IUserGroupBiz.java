package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.UserGroup;
import entrepreneurialcenter.office.util.Result;

public interface IUserGroupBiz {
	
	//查询所有信息。
	List<UserGroup> getAllUserGroupInfo();
	//查询所有条数。
	Integer getAllUserGroupCount();
	//按ID查询单条信息。
	String getUserGroupById(Long id);
	//新增信息。
	Result addUserGroup(UserGroup record);
	//删除信息。
	Result delUserGroup(String id);
	//修改信息。
	Result updateUserGroup(UserGroup record);
	
}
