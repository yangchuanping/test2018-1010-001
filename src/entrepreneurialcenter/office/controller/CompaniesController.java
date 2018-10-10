package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ICompaniesBiz;
import entrepreneurialcenter.office.pojo.Companies;
import entrepreneurialcenter.office.pojo.impl.CompaniesInfo;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Companies")
public class CompaniesController {

	@Autowired
	private ICompaniesBiz companiesBiz;
	
	@RequestMapping("/getAllCompaniesInfo")
	@ResponseBody
	public List<CompaniesInfo> getAllCompaniesInfo(){
		return companiesBiz.getAllCompaniesInfo();
	}
	
	@RequestMapping("/getAllCompaniesCount")
	@ResponseBody
	public String getAllCompaniesCount(){
		return JSON.toJSONString(companiesBiz.getAllCompaniesCount());
	}
	
	@RequestMapping("/getCompaniesById")
	@ResponseBody
	public String getCompaniesById(Long id){
		return companiesBiz.getCompaniesById(id);
	}
	
	@RequestMapping("/addCompanies")
	@ResponseBody
	public Result addCompanies(Companies record){
		return companiesBiz.addCompanies(record);
	}
	
	@RequestMapping("/delCompanies")
	@ResponseBody
	public Result delCompanies(String id){
		return companiesBiz.delCompanies(id);
	}
	
	@RequestMapping("/updateCompanies")
	@ResponseBody
	public Result updateCompanies(Companies record){
		return companiesBiz.updateCompanies(record);
	}
	
	@RequestMapping("/getCompaniesInfo")
	@ResponseBody
	public EasyUIDataGridResult getCompaniesInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "20")Integer rows){
		return companiesBiz.getCompaniesInfo(page, rows);
	}
	
	@RequestMapping("/RandSelectCompanies")
	@ResponseBody
	public List<CompaniesInfo> RandSelectCompanies(@RequestParam(defaultValue = "50")Integer rows){
		return companiesBiz.RandSelectCompanies(rows);
	}
	
	@RequestMapping("/likeSelectCompanies")
	@ResponseBody
	public List<CompaniesInfo> likeSelectCompanies(String value){
		return companiesBiz.likeSelectCompanies(value);
	}
}
