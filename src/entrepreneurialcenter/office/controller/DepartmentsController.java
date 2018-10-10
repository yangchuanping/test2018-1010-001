package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IDepartmentsBiz;
import entrepreneurialcenter.office.pojo.Departments;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Departments")
public class DepartmentsController {

	@Autowired
	private IDepartmentsBiz departmentsBiz;
	
	@RequestMapping("/getAllDepartmentsInfo")
	@ResponseBody
	public List<Departments> getAllDepartmentsInfo(){
		return departmentsBiz.getAllDepartmentsInfo();
	}
	
	@RequestMapping("/getAllDepartmentsCount")
	@ResponseBody
	public String getAllDepartmentsCount(){
		return JSON.toJSONString(departmentsBiz.getAllDepartmentsCount());
	}
	
	@RequestMapping("/getDepartmentsById")
	@ResponseBody
	public String getDepartmentsById(Long id){
		return departmentsBiz.getDepartmentsById(id);
	}
	
	@RequestMapping("/addDepartments")
	@ResponseBody
	public Result addDepartments(Departments record){
		return departmentsBiz.addDepartments(record);
	}
	
	@RequestMapping("/delDepartments")
	@ResponseBody
	public Result delDepartments(String id){
		return departmentsBiz.delDepartments(id);
	}
	
	@RequestMapping("/updateDepartments")
	@ResponseBody
	public Result updateDepartments(Departments record){
		return departmentsBiz.updateDepartments(record);
	}
	
}
