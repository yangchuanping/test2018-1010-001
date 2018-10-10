package entrepreneurialcenter.office.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IGardenApplyBiz;
import entrepreneurialcenter.office.pojo.GardenApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/GardenApply")
public class GardenApplyController {

	@Autowired
	private IGardenApplyBiz gardenApplyBiz;
	
	@RequestMapping("/getAllGardenApplyInfo")
	@ResponseBody
	public List<GardenApply> getAllGardenApplyInfo(){
		return gardenApplyBiz.getAllGardenApplyInfo();
	}
	
	@RequestMapping("/getAllGardenApplyCount")
	@ResponseBody
	public String getAllGardenApplyCount(){
		return JSON.toJSONString(gardenApplyBiz.getAllGardenApplyCount());
	}
	
	@RequestMapping("/getGardenApplyById")
	@ResponseBody
	public String getGardenApplyById(Integer id){
		return gardenApplyBiz.getGardenApplyById(id);
	}
	
	@RequestMapping("/addGardenApply")
	@ResponseBody
	public Result addGardenApply(GardenApply record){
		return gardenApplyBiz.addGardenApply(record);
	}
	
	@RequestMapping("/delGardenApply")
	@ResponseBody
	public Result delGardenApply(String id){
		return gardenApplyBiz.delGardenApply(id);
	}
	
	@RequestMapping("/updateGardenApply")
	@ResponseBody
	public Result updateGardenApply(GardenApply record){
		return gardenApplyBiz.updateGardenApply(record);
	}
	
	@RequestMapping("/getGardenApplyInfo")
	@ResponseBody
	public EasyUIDataGridResult getGardenApplyInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows){
		return gardenApplyBiz.getGardenApplyInfo(page, rows);
	}
	
	@RequestMapping("/LikeGardenApplyInfo")
	@ResponseBody
	public EasyUIDataGridResult LikeGardenApplyInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows
			, String gardenCompany, Integer gardenCheck, Date startTime, Date endTime){
		return gardenApplyBiz.LikeGardenApplyInfo(page, rows, gardenCompany, gardenCheck, startTime, endTime);
	}
	
	@RequestMapping("/getGardenByFrontId")
	@ResponseBody
	public List<GardenApply> getGardenByFrontId(Long id){
		return gardenApplyBiz.getGardenByFrontId(id);
	}
}
