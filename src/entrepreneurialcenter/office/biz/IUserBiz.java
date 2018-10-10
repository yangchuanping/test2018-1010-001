package entrepreneurialcenter.office.biz;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entrepreneurialcenter.office.pojo.User;
import entrepreneurialcenter.office.pojo.impl.UserGpDep;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IUserBiz {
	
	//查询所有信息。
	List<User> getAllUserInfo();
	//查询所有条数。
	Integer getAllUserCount();
	//按ID查询单条信息。
	String getUserById(Long id);
	//新增信息。
	Result addUser(User record);
	//删除信息。
	Result delUser(String id);
	//修改信息。
	Result updateUser(User record);
	//重置密码
	Result updateUserPass(Long id);
	//用户名登录。
	Result loginUser(String username, String password, HttpServletRequest request,HttpServletResponse response);
	//分页联表查询。
	EasyUIDataGridResult getUserInfo(Integer page, Integer rows);
	//联表查询所有用户信息。
	List<UserGpDep> getAllUserGpDepInfo();
}
