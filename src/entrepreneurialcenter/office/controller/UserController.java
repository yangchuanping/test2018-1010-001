package entrepreneurialcenter.office.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IUserBiz;
import entrepreneurialcenter.office.pojo.User;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/User")
public class UserController {

	@Autowired
	private IUserBiz userBiz;
	
	@RequestMapping("/getAllUserInfo")
	@ResponseBody
	public List<User> getAllUserInfo(){
		return userBiz.getAllUserInfo();
	}
	
	@RequestMapping("/getAllUserCount")
	@ResponseBody
	public String getAllUserCount(){
		return JSON.toJSONString(userBiz.getAllUserCount());
	}
	
	@RequestMapping("/getUserById")
	@ResponseBody
	public String getUserById(Long id){
		return userBiz.getUserById(id);
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public Result addUser(User record){
		return userBiz.addUser(record);
	}
	
	@RequestMapping("/delUser")
	@ResponseBody
	public Result delUser(String id){
		return userBiz.delUser(id);
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public Result updateUser(User record){
		return userBiz.updateUser(record);
	}
	
	@RequestMapping("/updateUserPass")
	@ResponseBody
	public Result updateUserPass(Long id){
		return userBiz.updateUserPass(id);
	}
	
	@RequestMapping("/loginUser")
	@ResponseBody
	public Result login(String username, String password, 
			HttpServletRequest request, HttpServletResponse response) {
		Result result = userBiz.loginUser(username, password, request, response);
		return result;
	}
	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public EasyUIDataGridResult getUserInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows){
		return userBiz.getUserInfo(page, rows);
	}
	
	@RequestMapping("/getAllUserGpDepInfo")
	@ResponseBody
	String getAllUserGpDepInfo(){
		return JSON.toJSONString(userBiz.getAllUserGpDepInfo());
	}
	
}
