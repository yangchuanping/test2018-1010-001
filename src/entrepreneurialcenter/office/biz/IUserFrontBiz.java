package entrepreneurialcenter.office.biz;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entrepreneurialcenter.office.pojo.UserFront;
import entrepreneurialcenter.office.util.Result;

public interface IUserFrontBiz {

	//查询所有信息。
	List<UserFront> getAllUserFrontInfo();
	//查询所有条数。
	Integer getAllUserFrontCount();
	//按ID查询单条信息。
	String getUserFrontById(Long id);
	//新增信息。
	Result addUserFront(UserFront record);
	//删除信息。
	Result delUserFront(String id);
	//修改信息。
	Result updateUserFront(UserFront record);
	//修改密码。
	Result updateUserFrontPass(Long id, String oldPass, String newPass);
	//检查手机号码是否重复
	Result getPhoneIsRepet(String value);
	//用户名登录。
	Result loginUserFront(String username, String password, HttpServletRequest request,HttpServletResponse response);
}
