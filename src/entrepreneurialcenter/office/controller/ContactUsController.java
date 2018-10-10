package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IContactUsBiz;
import entrepreneurialcenter.office.pojo.ContactUs;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ContactUs")
public class ContactUsController {

	@Autowired
	private IContactUsBiz contactUsBiz;
	
	@RequestMapping("/getAllContactUsInfo")
	@ResponseBody
	public List<ContactUs> getAllContactUsInfo(){
		return contactUsBiz.getAllContactUsInfo();
	}
	
	@RequestMapping("/getAllContactUsCount")
	@ResponseBody
	public String getAllContactUsCount(){
		return JSON.toJSONString(contactUsBiz.getAllContactUsCount());
	}
	
	@RequestMapping("/getContactUsById")
	@ResponseBody
	public String getContactUsById(Integer id){
		return contactUsBiz.getContactUsById(id);
	}
	
	@RequestMapping("/addContactUs")
	@ResponseBody
	public Result addContactUs(ContactUs record){
		return contactUsBiz.addContactUs(record);
	}
	
	@RequestMapping("/delContactUs")
	@ResponseBody
	public Result delContactUs(String id){
		return contactUsBiz.delContactUs(id);
	}
	
	@RequestMapping("/updateContactUs")
	@ResponseBody
	public Result updateContactUs(ContactUs record){
		return contactUsBiz.updateContactUs(record);
	}
	
	@RequestMapping("/getContactUsInfo")
	@ResponseBody
	public EasyUIDataGridResult getContactUsInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows){
		return contactUsBiz.getContactUsInfo(page, rows);
	}
	
	@RequestMapping("/likeContactUsInfo")
	@ResponseBody
	public EasyUIDataGridResult likeContactUsInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, Integer check, String value){
		return contactUsBiz.likeContactUsInfo(page, rows, check, value);
	}
	
}
