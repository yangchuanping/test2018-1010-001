package entrepreneurialcenter.office.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ISiteChangesBiz;
import entrepreneurialcenter.office.pojo.SiteChanges;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/SiteChanges")
public class SiteChangesController {

	@Autowired
	private ISiteChangesBiz siteChangesBiz;
	
	@RequestMapping("/getAllSiteChangesInfo")
	@ResponseBody
	public List<SiteChanges> getAllSiteChangesInfo(){
		return siteChangesBiz.getAllSiteChangesInfo();
	}
	
	@RequestMapping("/getAllSiteChangesCount")
	@ResponseBody
	public String getAllSiteChangesCount(){
		return JSON.toJSONString(siteChangesBiz.getAllSiteChangesCount());
	}
	
	@RequestMapping("/getSiteChangesById")
	@ResponseBody
	public String getSiteChangesById(Integer id){
		return siteChangesBiz.getSiteChangesById(id);
	}
	
	@RequestMapping("/addSiteChanges")
	@ResponseBody
	public Result addSiteChanges(SiteChanges record){
		return siteChangesBiz.addSiteChanges(record);
	}
	
	@RequestMapping("/delSiteChanges")
	@ResponseBody
	public Result delSiteChanges(String id){
		return siteChangesBiz.delSiteChanges(id);
	}
	
	@RequestMapping("/updateSiteChanges")
	@ResponseBody
	public Result updateSiteChanges(SiteChanges record){
		return siteChangesBiz.updateSiteChanges(record);
	}
	
	@RequestMapping("/getSiteChangesInfo")
	@ResponseBody
	public EasyUIDataGridResult getSiteChangesInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows){
		return siteChangesBiz.getSiteChangesInfo(page, rows);
	}
	
	@RequestMapping("/likeSiteChangesInfo")
	@ResponseBody
	public EasyUIDataGridResult likeSiteChangesInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, 
			String siteCompany, Integer siteCheck, Date startTime, Date endTime){
		return siteChangesBiz.likeSiteChangesInfo(page, rows, siteCompany, siteCheck, startTime, endTime);
	}
}
