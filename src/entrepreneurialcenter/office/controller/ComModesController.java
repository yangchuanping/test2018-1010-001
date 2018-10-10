package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComModesBiz;
import entrepreneurialcenter.office.pojo.ComModes;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ComModes")
public class ComModesController {

	@Autowired
	private IComModesBiz modesBiz;
	
	@RequestMapping("/getAllComModesInfo")
	@ResponseBody
	public List<ComModes> getAllComModesInfo(){
		return modesBiz.getAllComModesInfo();
	}
	
	@RequestMapping("/getAllComModesCount")
	@ResponseBody
	public String getAllComModesCount(){
		return JSON.toJSONString(modesBiz.getAllComModesCount());
	}
	
	@RequestMapping("/getComModesById")
	@ResponseBody
	public String getComModesById(Long id){
		return modesBiz.getComModesById(id);
	}
	
	@RequestMapping("/addComModes")
	@ResponseBody
	public Result addComModes(ComModes record){
		return modesBiz.addComModes(record);
	}
	
	@RequestMapping("/delComModes")
	@ResponseBody
	public Result delComModes(String id){
		return modesBiz.delComModes(id);
	}
	
	@RequestMapping("/updateComModes")
	@ResponseBody
	public Result updateComModes(ComModes record){
		return modesBiz.updateComModes(record);
	}
	
}
