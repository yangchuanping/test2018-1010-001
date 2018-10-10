package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IArticlesBiz;
import entrepreneurialcenter.office.dao.ArticlesMapper;
import entrepreneurialcenter.office.pojo.Articles;
import entrepreneurialcenter.office.pojo.ArticlesExample;
import entrepreneurialcenter.office.pojo.impl.ReceiveInfo;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class ArticlesBizImpl implements IArticlesBiz {
	
	@Autowired
	private ArticlesMapper articlesMapper;
	
	@Override
	public List<Articles> getAllArticles() {
		// TODO Auto-generated method stub
		ArticlesExample example = new ArticlesExample();
		return articlesMapper.selectByExample(example);
	}

	@Override
	public Integer getAllArticlesCount() {
		// TODO Auto-generated method stub
		return articlesMapper.countByExample(new ArticlesExample());
	}

	@Override
	public String getArticlesById(Long id) {
		// TODO Auto-generated method stub
		Articles articles = articlesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(articles);
	}

	@Override
	public Result addArticles(Articles record) {
		// TODO Auto-generated method stub
		if (articlesMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delArticles(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = articlesMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateArticles(Articles record) {
		// TODO Auto-generated method stub
		Articles articles = articlesMapper.selectByPrimaryKey(record.getArtId());
		articles.setArtTitle(record.getArtTitle());
		articles.setArtContent(record.getArtContent());
		articles.setArtThumb(record.getArtThumb());
		articles.setUserId(record.getUserId());
		articles.setArtAddressee(record.getArtAddressee());
		articles.setArtStatus(record.getArtStatus());
		articles.setUpdated(record.getUpdated());
		//articles.setCreated(record.getCreated());
		
		if (articlesMapper.updateByPrimaryKey(articles) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getReceiveInfoById(Integer page, Integer rows, Long id) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
						
		List<ReceiveInfo> list = articlesMapper.getReceiveInfoById(id);
		PageInfo<ReceiveInfo> pageInfo = new PageInfo<>(list);
				
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
			long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
				
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
				
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

	@Override
	public EasyUIDataGridResult getSendInfoById(Integer page, Integer rows, Long id) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
								
		List<ReceiveInfo> list = articlesMapper.getSendInfoById(id);
		PageInfo<ReceiveInfo> pageInfo = new PageInfo<>(list);
						
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
			long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
						
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
						
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

}
