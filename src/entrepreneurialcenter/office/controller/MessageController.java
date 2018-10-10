package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IMessageBiz;
import entrepreneurialcenter.office.pojo.Message;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Message")
public class MessageController {

	@Autowired
	private IMessageBiz messageBiz;
	
	@RequestMapping("/getAllMessageInfo")
	@ResponseBody
	public List<Message> getAllMessageInfo(){
		return messageBiz.getAllMessageInfo();
	}
	
	@RequestMapping("/getAllMessageCount")
	@ResponseBody
	public String getAllMessageCount(){
		return JSON.toJSONString(messageBiz.getAllMessageCount());
	}
	
	@RequestMapping("/getMessageById")
	@ResponseBody
	public String getMessageById(Long id){
		return messageBiz.getMessageById(id);
	}
	
	@RequestMapping("/addMessage")
	@ResponseBody
	public Result addMessage(Message record){
		return messageBiz.addMessage(record);
	}
	
	@RequestMapping("/delMessage")
	@ResponseBody
	public Result delMessage(String id){
		return messageBiz.delMessage(id);
	}
	
	@RequestMapping("/updateMessage")
	@ResponseBody
	public Result updateMessage(Message record){
		return messageBiz.updateMessage(record);
	}
	
	@RequestMapping("/getMessageInfo")
	@ResponseBody
	public EasyUIDataGridResult getMessageInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "13")Integer rows){
		return messageBiz.getMessageInfo(page, rows);
	}
	
	@RequestMapping("/getMessageInfoByType")
	@ResponseBody
	public EasyUIDataGridResult getMessageInfoByType(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, Integer type){
		return messageBiz.getMessageInfoByType(page, rows, type);
	}
	
	@RequestMapping("/likeMessageInfo")
	@ResponseBody
	public EasyUIDataGridResult likeMessageInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "13")Integer rows, String value, Integer type){
		return messageBiz.likeMessageInfo(page, rows, value, type);
	}
}
