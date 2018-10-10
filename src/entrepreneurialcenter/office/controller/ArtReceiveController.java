package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IArtReceiveBiz;
import entrepreneurialcenter.office.pojo.ArtReceive;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/ArtReceive")
public class ArtReceiveController {

	@Autowired
	private IArtReceiveBiz artReceiveBiz;
	
	@RequestMapping("/getAllArtReceive")
	@ResponseBody
	public List<ArtReceive> getAllArtReceiveInfo(){
		return artReceiveBiz.getAllArtReceiveInfo();
	}
	
	@RequestMapping("/getAllArtReceiveCount")
	@ResponseBody
	public String getAllArtReceiveCount(){
		return JSON.toJSONString(artReceiveBiz.getAllArtReceiveCount());
	}
	
	@RequestMapping("/getArtReceiveById")
	@ResponseBody
	public String getArtReceiveById(Long id){
		return artReceiveBiz.getArtReceiveById(id);
	}
	
	@RequestMapping("/addArtReceive")
	@ResponseBody
	public Result addArtReceive(ArtReceive record){
		return artReceiveBiz.addArtReceive(record);
	}
	
	@RequestMapping("/delArtReceive")
	@ResponseBody
	public Result delArtReceive(String id){
		return artReceiveBiz.delArtReceive(id);
	}
	
	@RequestMapping("/updateArtReceive")
	@ResponseBody
	public Result updateArtReceive(ArtReceive record){
		return artReceiveBiz.updateArtReceive(record);
	}
	
}
