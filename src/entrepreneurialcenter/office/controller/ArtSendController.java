package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IArtSendBiz;
import entrepreneurialcenter.office.pojo.ArtSend;
import entrepreneurialcenter.office.util.Result;


@Controller
@RequestMapping("/ArtSend")
public class ArtSendController {

	@Autowired
	private IArtSendBiz artSendBiz;
	
	@RequestMapping("/getAllArtSend")
	@ResponseBody
	public List<ArtSend> getAllArtSendInfo(){
		return artSendBiz.getAllArtSendInfo();
	}
	
	@RequestMapping("/getAllArtSendCount")
	@ResponseBody
	public String getAllArtSendCount(){
		return JSON.toJSONString(artSendBiz.getAllArtSendCount());
	}
	
	@RequestMapping("/getArtSendById")
	@ResponseBody
	public String getArtSendById(Long id){
		return artSendBiz.getArtSendById(id);
	}
	
	@RequestMapping("/addArtSend")
	@ResponseBody
	public Result addArtSend(ArtSend record){
		return artSendBiz.addArtSend(record);
	}
	
	@RequestMapping("/delArtSend")
	@ResponseBody
	public Result delArtSend(String id){
		return artSendBiz.delArtSend(id);
	}
	
	@RequestMapping("/updateArtSend")
	@ResponseBody
	public Result updateArtSend(ArtSend record){
		return artSendBiz.updateArtSend(record);
	}
	
}
