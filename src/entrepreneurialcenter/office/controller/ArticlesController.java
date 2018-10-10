package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IArticlesBiz;
import entrepreneurialcenter.office.pojo.Articles;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Articles")
public class ArticlesController {
	
	@Autowired
	private IArticlesBiz articlesBiz;
	
	@RequestMapping("/getAllArticles")
	@ResponseBody
	public List<Articles> getAllArticles(){
		return articlesBiz.getAllArticles();
	}
	
	@RequestMapping("/getAllArticlesCount")
	@ResponseBody
	public String getAllArticlesCount(){
		return JSON.toJSONString(articlesBiz.getAllArticlesCount());
	}
	
	@RequestMapping("/getArticlesById")
	@ResponseBody
	public String getArticlesById(Long id){
		return articlesBiz.getArticlesById(id);
	}
	
	@RequestMapping("/addArticles")
	@ResponseBody
	public Result addArticles(Articles record){
		return articlesBiz.addArticles(record);
	}
	
	@RequestMapping("/delArticles")
	@ResponseBody
	public Result delArticles(String id){
		return articlesBiz.delArticles(id);
	}
	
	@RequestMapping("/updateArticles")
	@ResponseBody
	public Result updateArticles(Articles record){
		return articlesBiz.updateArticles(record);
	}
	
	@RequestMapping("/getReceiveInfoById")
	@ResponseBody
	public EasyUIDataGridResult getReceiveInfoById(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "15")Integer rows, Long id){
		return articlesBiz.getReceiveInfoById(page, rows, id);
	}
	
	@RequestMapping("/getSendInfoById")
	@ResponseBody
	public EasyUIDataGridResult getSendInfoById(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "15")Integer rows, Long id){
		return articlesBiz.getSendInfoById(page, rows, id);
	}
}
