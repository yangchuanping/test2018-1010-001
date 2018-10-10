package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IPropertiesBiz;
import entrepreneurialcenter.office.pojo.Properties;
import entrepreneurialcenter.office.util.Result;


@Controller
@RequestMapping("/Properties")
public class PropertiesController {

	@Autowired
	private IPropertiesBiz propertiesBiz;
	
	@RequestMapping("/getAllPropertiesInfo")
	@ResponseBody
	public List<Properties> getAllPropertiesInfo(){
		return propertiesBiz.getAllPropertiesInfo();
	}
	
	@RequestMapping("/getAllPropertiesCount")
	@ResponseBody
	public String getAllPropertiesCount(){
		return JSON.toJSONString(propertiesBiz.getAllPropertiesCount());
	}
	
	@RequestMapping("/getPropertiesById")
	@ResponseBody
	public String getPropertiesById(Long id){
		return propertiesBiz.getPropertiesById(id);
	}
	
	@RequestMapping("/addProperties")
	@ResponseBody
	public Result addProperties(Properties record){
		return propertiesBiz.addProperties(record);
	}
	
	@RequestMapping("/delProperties")
	@ResponseBody
	public Result delProperties(String id){
		return propertiesBiz.delProperties(id);
	}
	
	@RequestMapping("/updateProperties")
	@ResponseBody
	public Result updateProperties(Properties record){
		return propertiesBiz.updateProperties(record);
	}
	
}
