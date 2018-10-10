package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IAttractBiz;
import entrepreneurialcenter.office.pojo.Attract;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Attract")
public class AttractController {

	@Autowired
	private IAttractBiz attractBiz;
	
	@RequestMapping("/getAllAttractInfo")
	@ResponseBody
	public List<Attract> getAllAttractInfo(){
		return attractBiz.getAllAttractInfo();
	}
	
	@RequestMapping("/getAllAttractCount")
	@ResponseBody
	public String getAllAttractCount(){
		return JSON.toJSONString(attractBiz.getAllAttractCount());
	}
	
	@RequestMapping("/getAttractById")
	@ResponseBody
	public String getAttractById(Integer id){
		return attractBiz.getAttractById(id);
	}
	
	@RequestMapping("/addAttract")
	@ResponseBody
	public Result addAttract(Attract record){
		return attractBiz.addAttract(record);
	}
	
	@RequestMapping("/delAttract")
	@ResponseBody
	public Result delAttract(String id){
		return attractBiz.delAttract(id);
	}
	
	@RequestMapping("/updateAttract")
	@ResponseBody
	public Result updateAttract(Attract record){
		return attractBiz.updateAttract(record);
	}
	
	@RequestMapping("/likeAttractInfo")
	@ResponseBody
	public EasyUIDataGridResult likeAttractInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, String value, String garden, String area){
		return attractBiz.likeAttractInfo(page, rows, value, garden, area);
	}
	
	@RequestMapping("/likeAttractInfoBackPage")
	@ResponseBody
	public EasyUIDataGridResult likeAttractInfoBackPage(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "15")Integer rows, String status, String garden, String area){
		return attractBiz.likeAttractInfoBackPage(page, rows, garden, area, status);
	}
}
