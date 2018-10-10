package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComTypesBiz;
import entrepreneurialcenter.office.pojo.ComTypes;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ComTypes")
public class ComTypesController {

	@Autowired
	private IComTypesBiz typesBiz;
	
	@RequestMapping("/getAllComTypesInfo")
	@ResponseBody
	public List<ComTypes> getAllComTypesInfo(){
		return typesBiz.getAllComTypesInfo();
	}
	
	@RequestMapping("/getAllComTypesCount")
	@ResponseBody
	public String getAllComTypesCount(){
		return JSON.toJSONString(typesBiz.getAllComTypesCount());
	}
	
	@RequestMapping("/getComTypesById")
	@ResponseBody
	public String getComTypesById(Long id){
		return typesBiz.getComTypesById(id);
	}
	
	@RequestMapping("/addComTypes")
	@ResponseBody
	public Result addComTypes(ComTypes record){
		return typesBiz.addComTypes(record);
	}
	
	@RequestMapping("/delComTypes")
	@ResponseBody
	public Result delComTypes(String id){
		return typesBiz.delComTypes(id);
	}
	
	@RequestMapping("/updateComTypes")
	@ResponseBody
	public Result updateComTypes(ComTypes record){
		return typesBiz.updateComTypes(record);
	}
	
}
