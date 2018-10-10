package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Articles;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IArticlesBiz {
	
	//查询所有信息。
	List<Articles> getAllArticles();
	//查询所有条数。
	Integer getAllArticlesCount();
	//按ID查询单条信息。
	String getArticlesById(Long id);
	//新增信息。
	Result addArticles(Articles record);
	//删除信息。
	Result delArticles(String id);
	//修改信息。
	Result updateArticles(Articles record);
	//按ID联表查询收件箱。
	EasyUIDataGridResult getReceiveInfoById(Integer page, Integer rows, Long id);
	//按Id联表查询发件箱。
	EasyUIDataGridResult getSendInfoById(Integer page, Integer rows, Long id);
	
}
