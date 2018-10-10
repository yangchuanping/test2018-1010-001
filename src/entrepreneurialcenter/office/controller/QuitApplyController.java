package entrepreneurialcenter.office.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IQuitApplyBiz;
import entrepreneurialcenter.office.pojo.QuitApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/QuitApply")
public class QuitApplyController {

	@Autowired
	private IQuitApplyBiz quitApplyBiz;
	
	@RequestMapping("/getAllQuitApplyInfo")
	@ResponseBody
	public List<QuitApply> getAllQuitApplyInfo(){
		return quitApplyBiz.getAllQuitApplyInfo();
	}
	
	@RequestMapping("/getAllQuitApplyCount")
	@ResponseBody
	public String getAllQuitApplyCount(){
		return JSON.toJSONString(quitApplyBiz.getAllQuitApplyCount());
	}
	
	@RequestMapping("/getQuitApplyById")
	@ResponseBody
	public String getQuitApplyById(Integer id){
		return quitApplyBiz.getQuitApplyById(id);
	}
	
	@RequestMapping("/addQuitApply")
	@ResponseBody
	public Result addQuitApply(QuitApply record){
		return quitApplyBiz.addQuitApply(record);
	}
	
	@RequestMapping("/delQuitApply")
	@ResponseBody
	public Result delQuitApply(String id){
		return quitApplyBiz.delQuitApply(id);
	}
	
	@RequestMapping("/updateQuitApply")
	@ResponseBody
	public Result updateQuitApply(QuitApply record){
		return quitApplyBiz.updateQuitApply(record);
	}
	
	@RequestMapping("/getQuitApplyInfo")
	@ResponseBody
	public EasyUIDataGridResult getQuitApplyInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows){
		return quitApplyBiz.getQuitApplyInfo(page, rows);
	}
	
	@RequestMapping("/likeQuitApplyInfo")
	@ResponseBody
	public EasyUIDataGridResult likeQuitApplyInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, 
			String quitCompany, Integer quitCheck, Date startTime, Date endTime){
		return quitApplyBiz.likeQuitApplyInfo(page, rows, quitCompany, quitCheck, startTime, endTime);
	}
}
