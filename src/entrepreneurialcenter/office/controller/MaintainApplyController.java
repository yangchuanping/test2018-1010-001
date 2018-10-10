package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IMaintainApplyBiz;
import entrepreneurialcenter.office.pojo.MaintainApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/MaintainApply")
public class MaintainApplyController {

	@Autowired
	private IMaintainApplyBiz maintainApplyBiz;
	
	@RequestMapping("/getAllMaintainApplyInfo")
	@ResponseBody
	public List<MaintainApply> getAllMaintainApplyInfo(){
		return maintainApplyBiz.getAllMaintainApplyInfo();
	}
	
	@RequestMapping("/getAllMaintainApplyCount")
	@ResponseBody
	public String getAllMaintainApplyCount(){
		return JSON.toJSONString(maintainApplyBiz.getAllMaintainApplyCount());
	}
	
	@RequestMapping("/getMaintainApplyById")
	@ResponseBody
	public String getMaintainApplyById(Integer id){
		return maintainApplyBiz.getMaintainApplyById(id);
	}
	
	@RequestMapping("/addMaintainApply")
	@ResponseBody
	public Result addMaintainApply(MaintainApply record){
		return maintainApplyBiz.addMaintainApply(record);
	}
	
	@RequestMapping("/delMaintainApply")
	@ResponseBody
	public Result delMaintainApply(String id){
		return maintainApplyBiz.delMaintainApply(id);
	}
	
	@RequestMapping("/updateMaintainApply")
	@ResponseBody
	public Result updateMaintainApply(MaintainApply record){
		return maintainApplyBiz.updateMaintainApply(record);
	}
	
	@RequestMapping("/getMaintainApplyInfo")
	@ResponseBody
	public EasyUIDataGridResult getMaintainApplyInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows){
		return maintainApplyBiz.getMaintainApplyInfo(page, rows);
	}
	
	@RequestMapping("/likeMaintainApplyInfo")
	@ResponseBody
	public EasyUIDataGridResult likeMaintainApplyInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, String value, String address,
			Integer check){
		return maintainApplyBiz.likeMaintainApplyInfo(page, rows, value, address, check);
	}
}
