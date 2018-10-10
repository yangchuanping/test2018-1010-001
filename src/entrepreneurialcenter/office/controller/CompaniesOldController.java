package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ICompaniesOldBiz;
import entrepreneurialcenter.office.pojo.CompaniesOld;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/CompaniesOld")
public class CompaniesOldController {
	
	@Autowired
	private ICompaniesOldBiz oldBiz;
	
	@RequestMapping("/getAllCompaniesOldInfo")
	@ResponseBody
	public List<CompaniesOld> getAllCompaniesOldInfo(){
		return oldBiz.getAllCompaniesOldInfo();
	}
	
	@RequestMapping("/getAllCompaniesOldCount")
	@ResponseBody
	public String getAllCompaniesOldCount(){
		return JSON.toJSONString(oldBiz.getAllCompaniesOldCount());
	}
	
	@RequestMapping("/getCompaniesOldById")
	@ResponseBody
	public String getCompaniesOldById(Long id){
		return oldBiz.getCompaniesOldById(id);
	}
	
	@RequestMapping("/addCompaniesOld")
	@ResponseBody
	public Result addCompaniesOld(CompaniesOld record){
		return oldBiz.addCompaniesOld(record);
	}
	
	@RequestMapping("/delCompaniesOld")
	@ResponseBody
	public Result delCompaniesOld(String id){
		return oldBiz.delCompaniesOld(id);
	}
	
	@RequestMapping("/updateCompaniesOld")
	@ResponseBody
	public Result updateCompaniesOld(CompaniesOld record){
		return oldBiz.updateCompaniesOld(record);
	}
	
}
