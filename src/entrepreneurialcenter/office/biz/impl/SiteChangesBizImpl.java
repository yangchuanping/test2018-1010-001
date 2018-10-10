package entrepreneurialcenter.office.biz.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.ISiteChangesBiz;
import entrepreneurialcenter.office.dao.SiteChangesMapper;
import entrepreneurialcenter.office.pojo.SiteChanges;
import entrepreneurialcenter.office.pojo.SiteChangesExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class SiteChangesBizImpl implements ISiteChangesBiz {

	@Autowired
	private SiteChangesMapper siteChangesMapper;
	
	@Override
	public List<SiteChanges> getAllSiteChangesInfo() {
		// TODO Auto-generated method stub
		return siteChangesMapper.selectByExample(new SiteChangesExample());
	}

	@Override
	public Integer getAllSiteChangesCount() {
		// TODO Auto-generated method stub
		return siteChangesMapper.countByExample(new SiteChangesExample());
	}

	@Override
	public String getSiteChangesById(Integer id) {
		// TODO Auto-generated method stub
		SiteChanges siteChanges = siteChangesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(siteChanges);
	}

	@Override
	public Result addSiteChanges(SiteChanges record) {
		// TODO Auto-generated method stub
		record.setSiteCheck(0);
		record.setSiteCreate(new Date());
		if (siteChangesMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delSiteChanges(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = siteChangesMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateSiteChanges(SiteChanges record) {
		// TODO Auto-generated method stub
		SiteChanges siteChanges = siteChangesMapper.selectByPrimaryKey(record.getSiteId());
		siteChanges.setIndId(record.getIndId());
		siteChanges.setSiteApplyarea(record.getSiteApplyarea());
		siteChanges.setSiteArea(record.getSiteArea());
		siteChanges.setSiteBasecase(record.getSiteBasecase());
		siteChanges.setSiteBusinesscase(record.getSiteBusinesscase());
		siteChanges.setSiteCapital(record.getSiteCapital());
		siteChanges.setSiteCompany(record.getSiteCompany());
		siteChanges.setSiteDate(record.getSiteDate());
		siteChanges.setSiteDrma(record.getSiteDrma());
		siteChanges.setSiteExplain(record.getSiteExplain());
		siteChanges.setSiteFormed(record.getSiteFormed());
		siteChanges.setSiteGarden(record.getSiteGarden());
		siteChanges.setSiteHeadcount(record.getSiteHeadcount());
		siteChanges.setSiteIp(record.getSiteIp());
		siteChanges.setSiteLastratal(record.getSiteLastratal());
		siteChanges.setSiteLastsale(record.getSiteLastsale());
		siteChanges.setSiteLawemail(record.getSiteLawemail());
		siteChanges.setSiteLawperson(record.getSiteLawperson());
		siteChanges.setSiteLawphone(record.getSiteLawphone());
		siteChanges.setSiteLinkemail(record.getSiteLinkemail());
		siteChanges.setSiteLinkfax(record.getSiteLinkfax());
		siteChanges.setSiteLinkname(record.getSiteLinkname());
		siteChanges.setSiteLinkphone(record.getSiteLinkphone());
		siteChanges.setSiteNumber(record.getSiteNumber());
		siteChanges.setSiteProduct(record.getSiteProduct());
		siteChanges.setSiteUndergraduate(record.getSiteUndergraduate());
		siteChanges.setSiteYtdratal(record.getSiteYtdratal());
		siteChanges.setSiteYtdsale(record.getSiteYtdsale());
		siteChanges.setSiteUpdate(new Date());
		
		if (siteChangesMapper.updateByPrimaryKey(siteChanges) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getSiteChangesInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		
		SiteChangesExample example = new SiteChangesExample();
		example.setOrderByClause("site_create desc");
		List<SiteChanges> list = siteChangesMapper.selectByExample(example);
		
		PageInfo<SiteChanges> pageInfo = new PageInfo<>(list);
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
	public EasyUIDataGridResult likeSiteChangesInfo(Integer page, Integer rows, String siteCompany, Integer siteCheck,
			Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
				
		SiteChangesExample example = new SiteChangesExample();
		example.setOrderByClause("site_create desc");
		SiteChangesExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(siteCompany)&&!siteCompany.equals("null")) {
			criteria.andSiteCompanyLike("%"+siteCompany+"%");
		}
		if(startTime!=null&&endTime!=null){
			criteria.andSiteCreateBetween(startTime, endTime);
		}
		if (siteCheck != -1) {
			criteria.andSiteCheckEqualTo(siteCheck);
		}
		
		List<SiteChanges> list = siteChangesMapper.selectByExample(example);
			
		PageInfo<SiteChanges> pageInfo = new PageInfo<>(list);
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
