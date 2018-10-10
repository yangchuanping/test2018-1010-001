package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IProBuildingsBiz;
import entrepreneurialcenter.office.pojo.ProBuildings;
import entrepreneurialcenter.office.pojo.impl.ProBuiReg;
import entrepreneurialcenter.office.util.Result;


@Controller
@RequestMapping("/ProBuildings")
public class ProBuildingsController {

	@Autowired
	private IProBuildingsBiz buildingsBiz;
	
	@RequestMapping("/getAllProBuildingsInfo")
	@ResponseBody
	public List<ProBuildings> getAllProBuildingsInfo(){
		return buildingsBiz.getAllProBuildingsInfo();
	}
	
	@RequestMapping("/getProBuiReg")
	@ResponseBody
	public List<ProBuiReg> getProBuiReg(){
		return buildingsBiz.getProBuiReg();
	}
	
	@RequestMapping("/getAllProBuildingsCount")
	@ResponseBody
	public String getAllProBuildingsCount(){
		return JSON.toJSONString(buildingsBiz.getAllProBuildingsCount());
	}
	
	@RequestMapping("/getBuiByReg")
	@ResponseBody
	public List<ProBuildings> getBuiByReg(Long id){
		return buildingsBiz.getBuiByReg(id);
	}
	
	@RequestMapping("/getProBuildingsById")
	@ResponseBody
	public String getProBuildingsById(Long id){
		return buildingsBiz.getProBuildingsById(id);
	}
	
	@RequestMapping("/addProBuildings")
	@ResponseBody
	public Result addProBuildings(ProBuildings record){
		return buildingsBiz.addProBuildings(record);
	}
	
	@RequestMapping("/delProBuildings")
	@ResponseBody
	public Result delProBuildings(String id){
		return buildingsBiz.delProBuildings(id);
	}
	
	@RequestMapping("/updateProBuildings")
	@ResponseBody
	public Result updateProBuildings(ProBuildings record){
		return buildingsBiz.updateProBuildings(record);
	}
	
}
