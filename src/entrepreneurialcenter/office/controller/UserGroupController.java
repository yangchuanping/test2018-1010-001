package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IUserGroupBiz;
import entrepreneurialcenter.office.pojo.UserGroup;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/UserGroup")
public class UserGroupController {

	@Autowired
	private IUserGroupBiz userGroupBiz;
	
	@RequestMapping("/getAllUserGroupInfo")
	@ResponseBody
	public List<UserGroup> getAllUserGroupInfo(){
		return userGroupBiz.getAllUserGroupInfo();
	}
	
	@RequestMapping("/getAllUserGroupCount")
	@ResponseBody
	public String getAllUserGroupCount(){
		return JSON.toJSONString(userGroupBiz.getAllUserGroupCount());
	}
	
	@RequestMapping("/getUserGroupById")
	@ResponseBody
	public String getUserGroupById(Long id){
		return userGroupBiz.getUserGroupById(id);
	}
	
	@RequestMapping("/addUserGroup")
	@ResponseBody
	public Result addUserGroup(UserGroup record){
		return userGroupBiz.addUserGroup(record);
	}
	
	@RequestMapping("/delUserGroup")
	@ResponseBody
	public Result delUserGroup(String id){
		return userGroupBiz.delUserGroup(id);
	}
	
	@RequestMapping("/updateUserGroup")
	@ResponseBody
	public Result updateUserGroup(UserGroup record){
		return userGroupBiz.updateUserGroup(record);
	}
	
}
