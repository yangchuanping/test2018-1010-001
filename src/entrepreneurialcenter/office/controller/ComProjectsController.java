package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComProjectsBiz;
import entrepreneurialcenter.office.pojo.ComProjects;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ComProjects")
public class ComProjectsController {

	@Autowired
	private IComProjectsBiz projectsBiz;
	
	@RequestMapping("/getAllComProjectsInfo")
	@ResponseBody
	public List<ComProjects> getAllComProjectsInfo(){
		return projectsBiz.getAllComProjectsInfo();
	}
	
	@RequestMapping("/getAllComProjectsCount")
	@ResponseBody
	public String getAllComProjectsCount(){
		return JSON.toJSONString(projectsBiz.getAllComProjectsCount());
	}
	
	@RequestMapping("/getComProjectsById")
	@ResponseBody
	public String getComProjectsById(Long id){
		return projectsBiz.getComProjectsById(id);
	}
	
	@RequestMapping("/addComProjects")
	@ResponseBody
	public Result addComProjects(ComProjects record){
		return projectsBiz.addComProjects(record);
	}
	
	@RequestMapping("/delComProjects")
	@ResponseBody
	public Result delComProjects(String id){
		return projectsBiz.delComProjects(id);
	}
	
	@RequestMapping("/updateComProjects")
	@ResponseBody
	public Result updateComProjects(ComProjects record){
		return projectsBiz.updateComProjects(record);
	}
	
}
