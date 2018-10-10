package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IProRegionsBiz;
import entrepreneurialcenter.office.pojo.ProRegions;
import entrepreneurialcenter.office.util.Result;


@Controller
@RequestMapping("/ProRegions")
public class ProRegionsController {

	@Autowired
	private IProRegionsBiz regionsBiz;
	
	@RequestMapping("/getAllProRegionsInfo")
	@ResponseBody
	public List<ProRegions> getAllProRegionsInfo(){
		return regionsBiz.getAllProRegionsInfo();
	}
	
	@RequestMapping("/getProRegionsInfoByStatus")
	@ResponseBody
	public List<ProRegions> getProRegionsInfoByStatus(){
		return regionsBiz.getProRegionsInfoByStatus();
	}
	
	@RequestMapping("/getAllProRegionsCount")
	@ResponseBody
	public String getAllProRegionsCount(){
		return JSON.toJSONString(regionsBiz.getAllProRegionsCount());
	}
	
	@RequestMapping("/getProRegionsById")
	@ResponseBody
	public String getProRegionsById(Long id){
		return regionsBiz.getProRegionsById(id);
	}
	
	@RequestMapping("/addProRegions")
	@ResponseBody
	public Result addProRegions(ProRegions record){
		return regionsBiz.addProRegions(record);
	}
	
	@RequestMapping("/delProRegions")
	@ResponseBody
	public Result delProRegions(String id){
		return regionsBiz.delProRegions(id);
	}
	
	@RequestMapping("/updateProRegions")
	@ResponseBody
	public Result updateProRegions(ProRegions record){
		return regionsBiz.updateProRegions(record);
	}
	
}
