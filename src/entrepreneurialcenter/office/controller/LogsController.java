package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ILogsBiz;
import entrepreneurialcenter.office.pojo.Logs;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Logs")
public class LogsController {

	@Autowired
	private ILogsBiz logsBiz;
	
	@RequestMapping("/getAllLogsInfo")
	@ResponseBody
	public List<Logs> getAllLogsInfo(){
		return logsBiz.getAllLogsInfo();
	}
	
	@RequestMapping("/getAllLogsCount")
	@ResponseBody
	public String getAllLogsCount(){
		return JSON.toJSONString(logsBiz.getAllLogsCount());
	}
	
	@RequestMapping("/getLogsById")
	@ResponseBody
	public String getLogsById(Long id){
		return logsBiz.getLogsById(id);
	}
	
	@RequestMapping("/addLogs")
	@ResponseBody
	public Result addLogs(Logs record){
		return logsBiz.addLogs(record);
	}
	
	@RequestMapping("/delLogs")
	@ResponseBody
	public Result delLogs(String id){
		return logsBiz.delLogs(id);
	}
	
	@RequestMapping("/updateLogs")
	@ResponseBody
	public Result updateLogs(Logs record){
		return logsBiz.updateLogs(record);
	}
	
}
