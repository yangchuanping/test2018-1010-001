package entrepreneurialcenter.office.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IUserFrontBiz;
import entrepreneurialcenter.office.pojo.UserFront;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/UserFront")
public class UserFrontController {

	@Autowired
	private IUserFrontBiz frontBiz; 
	
	@RequestMapping("/getAllUserFrontInfo")
	@ResponseBody
	public List<UserFront> getAllUserFrontInfo(){
		return frontBiz.getAllUserFrontInfo();
	}
	
	@RequestMapping("/getAllUserFrontCount")
	@ResponseBody
	public String getAllUserFrontCount(){
		return JSON.toJSONString(frontBiz.getAllUserFrontCount());
	}
	
	@RequestMapping("/getUserFrontById")
	@ResponseBody
	public String getUserFrontById(Long id){
		return frontBiz.getUserFrontById(id);
	}
	
	@RequestMapping("/addUserFront")
	@ResponseBody
	public Result addUserFront(UserFront record){
		return frontBiz.addUserFront(record);
	}
	
	@RequestMapping("/delUserFront")
	@ResponseBody
	public Result delUserFront(String id){
		return frontBiz.delUserFront(id);
	}
	
	@RequestMapping("/updateUserFront")
	@ResponseBody
	public Result updateUserFront(UserFront record){
		return frontBiz.updateUserFront(record);
	}
	
	@RequestMapping("/updateUserFrontPass")
	@ResponseBody
	public Result updateUserFrontPass(Long id, String oldPass, String newPass){
		return frontBiz.updateUserFrontPass(id, oldPass, newPass);
	}
	
	@RequestMapping("/getPhoneIsRepet")
	@ResponseBody
	public Result getPhoneIsRepet(String value){
		return frontBiz.getPhoneIsRepet(value);
	}
	
	@RequestMapping("/loginUserFront")
	@ResponseBody
	public Result loginUserFront(String username, String password, 
			HttpServletRequest request, HttpServletResponse response){
		return frontBiz.loginUserFront(username, password, request, response);
	}
}
