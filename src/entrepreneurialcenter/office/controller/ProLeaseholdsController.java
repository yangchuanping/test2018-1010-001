package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IProLeaseholdsBiz;
import entrepreneurialcenter.office.pojo.ProLeaseholds;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ProLeaseholds")
public class ProLeaseholdsController {

	@Autowired
	private IProLeaseholdsBiz leaseholdsBiz;
	
	@RequestMapping("/getAllProLeaseholdsInfo")
	@ResponseBody
	public List<ProLeaseholds> getAllProLeaseholdsInfo(){
		return leaseholdsBiz.getAllProLeaseholdsInfo();
	}
	
	@RequestMapping("/getAllProLeaseholdsCount")
	@ResponseBody
	public String getAllProLeaseholdsCount(){
		return JSON.toJSONString(leaseholdsBiz.getAllProLeaseholdsCount());
	}
	
	@RequestMapping("/getProLeaseholdsById")
	@ResponseBody
	public String getProLeaseholdsById(Long id){
		return leaseholdsBiz.getProLeaseholdsById(id);
	}
	
	@RequestMapping("/addProLeaseholds")
	@ResponseBody
	public Result addProLeaseholds(ProLeaseholds record){
		return leaseholdsBiz.addProLeaseholds(record);
	}
	
	@RequestMapping("/delProLeaseholds")
	@ResponseBody
	public Result delProLeaseholds(String id){
		return leaseholdsBiz.delProLeaseholds(id);
	}
	
	@RequestMapping("/updateProLeaseholds")
	@ResponseBody
	public Result updateProLeaseholds(ProLeaseholds record){
		return leaseholdsBiz.updateProLeaseholds(record);
	}
	
}
