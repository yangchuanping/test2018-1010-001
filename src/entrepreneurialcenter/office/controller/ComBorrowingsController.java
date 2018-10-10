package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComBorrowingsBiz;
import entrepreneurialcenter.office.pojo.ComBorrowings;
import entrepreneurialcenter.office.util.Result;


@Controller
@RequestMapping("/ComBorrowings")
public class ComBorrowingsController {

	@Autowired
	private IComBorrowingsBiz borrowingsBiz;
	
	@RequestMapping("/getAllComBorrowings")
	@ResponseBody
	public List<ComBorrowings> getAllComBorrowingsInfo(){
		return borrowingsBiz.getAllComBorrowingsInfo();
	}
	
	@RequestMapping("/getAllComBorrowingsCount")
	@ResponseBody
	public String getAllComBorrowingsCount(){
		return JSON.toJSONString(borrowingsBiz.getAllComBorrowingsCount());
	}
	
	@RequestMapping("/getComBorrowingsById")
	@ResponseBody
	public String getComBorrowingsById(Long id){
		return borrowingsBiz.getComBorrowingsById(id);
	}
	
	@RequestMapping("/addComBorrowings")
	@ResponseBody
	public Result addComBorrowings(ComBorrowings record){
		return borrowingsBiz.addComBorrowings(record);
	}
	
	@RequestMapping("/delComBorrowings")
	@ResponseBody
	public Result delComBorrowings(String id){
		return borrowingsBiz.delComBorrowings(id);
	}
	
	@RequestMapping("/updateComBorrowings")
	@ResponseBody
	public Result updateComBorrowings(ComBorrowings record){
		return borrowingsBiz.updateComBorrowings(record);
	}
	
}
