package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComIdentifyBiz;
import entrepreneurialcenter.office.pojo.ComIdentify;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ComIdentify")
public class ComIdentifyController {

	@Autowired
	private IComIdentifyBiz comIdentifyBiz;
	
	@RequestMapping("/getAllComIdentify")
	@ResponseBody
	public List<ComIdentify> getAllComIdentifyInfo(){
		return comIdentifyBiz.getAllComIdentifyInfo();
	}
	
	@RequestMapping("/getAllComIdentifyCount")
	@ResponseBody
	public String getAllComIdentifyCount(){
		return JSON.toJSONString(comIdentifyBiz.getAllComIdentifyCount());
	}
	
	@RequestMapping("/getComIdentifyById")
	@ResponseBody
	public String getComIdentifyById(Long id){
		return comIdentifyBiz.getComIdentifyById(id);
	}
	
	@RequestMapping("/addComIdentify")
	@ResponseBody
	public Result addComIdentify(ComIdentify record){
		return comIdentifyBiz.addComIdentify(record);
	}
	
	@RequestMapping("/delComIdentify")
	@ResponseBody
	public Result delComIdentify(String id){
		return comIdentifyBiz.delComIdentify(id);
	}
	
	@RequestMapping("/updateComIdentify")
	@ResponseBody
	public Result updateComIdentify(ComIdentify record){
		return comIdentifyBiz.updateComIdentify(record);
	}
	
}
