package entrepreneurialcenter.office.biz.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IQuitApplyBiz;
import entrepreneurialcenter.office.dao.QuitApplyMapper;
import entrepreneurialcenter.office.pojo.QuitApply;
import entrepreneurialcenter.office.pojo.QuitApplyExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class QuitApplyBizImpl implements IQuitApplyBiz {

	@Autowired
	private QuitApplyMapper quitApplyMapper;
	
	@Override
	public List<QuitApply> getAllQuitApplyInfo() {
		// TODO Auto-generated method stub
		return quitApplyMapper.selectByExample(new QuitApplyExample());
	}

	@Override
	public Integer getAllQuitApplyCount() {
		// TODO Auto-generated method stub
		return quitApplyMapper.countByExample(new QuitApplyExample());
	}

	@Override
	public String getQuitApplyById(Integer id) {
		// TODO Auto-generated method stub
		QuitApply quitApply = quitApplyMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(quitApply);
	}

	@Override
	public Result addQuitApply(QuitApply record) {
		// TODO Auto-generated method stub
		record.setQuitCheck(0);
		record.setQuitCreate(new Date());
		if (quitApplyMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delQuitApply(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = quitApplyMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateQuitApply(QuitApply record) {
		// TODO Auto-generated method stub
		QuitApply quitApply = quitApplyMapper.selectByPrimaryKey(record.getQuitId());
		quitApply.setQuitCompany(record.getQuitCompany());
		quitApply.setQuitName(record.getQuitName());
		quitApply.setQuitRegion(record.getQuitRegion());
		quitApply.setQuitNumber(record.getQuitNumber());
		quitApply.setQuitPhone(record.getQuitPhone());
		quitApply.setQuitState(record.getQuitState());
		quitApply.setQuitType(record.getQuitType());
		quitApply.setQuitUpdate(new Date());
		
		if (quitApplyMapper.updateByPrimaryKey(quitApply) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getQuitApplyInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		
		QuitApplyExample example = new QuitApplyExample();
		example.setOrderByClause("quit_create desc");
		List<QuitApply> list = quitApplyMapper.selectByExample(example);
		
		PageInfo<QuitApply> pageInfo = new PageInfo<>(list);
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
	public EasyUIDataGridResult likeQuitApplyInfo(Integer page, Integer rows, String quitCompany, Integer quitCheck,
			Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
				
		QuitApplyExample example = new QuitApplyExample();
		example.setOrderByClause("quit_create desc");
		QuitApplyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(quitCompany)&&!quitCompany.equals("null")) {
			criteria.andQuitCompanyLike("%"+quitCompany+"%");
		}
		if(startTime!=null&&endTime!=null){
			criteria.andQuitCreateBetween(startTime, endTime);
		}
		if (quitCheck != -1) {
			criteria.andQuitCheckEqualTo(quitCheck);
		}
		
		List<QuitApply> list = quitApplyMapper.selectByExample(example);
				
		PageInfo<QuitApply> pageInfo = new PageInfo<>(list);
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
