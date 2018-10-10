package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComIndustriesBiz;
import entrepreneurialcenter.office.pojo.ComIndustries;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ComIndustries")
public class ComIndustriesController {
	
	@Autowired
	private IComIndustriesBiz comIndustriesBiz;
	
	@RequestMapping("/getAllComIndustriesInfo")
	@ResponseBody
	public List<ComIndustries> getAllComIndustriesInfo(){
		return comIndustriesBiz.getAllComIndustriesInfo();
	}
	
	@RequestMapping("/getAllComIndustriesCount")
	@ResponseBody
	public String getAllComIndustriesCount(){
		return JSON.toJSONString(comIndustriesBiz.getAllComIndustriesCount());
	}
	
	@RequestMapping("/getComIndustriesById")
	@ResponseBody
	public String getComIndustriesById(Long id){
		return comIndustriesBiz.getComIndustriesById(id);
	}
	
	@RequestMapping("/addComIndustries")
	@ResponseBody
	public Result addComIndustries(ComIndustries record){
		return comIndustriesBiz.addComIndustries(record);
	}
	
	@RequestMapping("/delComIndustries")
	@ResponseBody
	public Result delComIndustries(String id){
		return comIndustriesBiz.delComIndustries(id);
	}
	
	@RequestMapping("/updateComIndustries")
	@ResponseBody
	public Result updateComIndustries(ComIndustries record){
		return comIndustriesBiz.updateComIndustries(record);
	}
	
}
