package entrepreneurialcenter.office.biz.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IGardenApplyBiz;
import entrepreneurialcenter.office.dao.GardenApplyMapper;
import entrepreneurialcenter.office.pojo.GardenApply;
import entrepreneurialcenter.office.pojo.GardenApplyExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class GardenApplyBizImpl implements IGardenApplyBiz {

	@Autowired
	private GardenApplyMapper gardenApplyMapper;
	
	@Override
	public List<GardenApply> getAllGardenApplyInfo() {
		// TODO Auto-generated method stub
		return gardenApplyMapper.selectByExample(new GardenApplyExample());
	}

	@Override
	public Integer getAllGardenApplyCount() {
		// TODO Auto-generated method stub
		return gardenApplyMapper.countByExample(new GardenApplyExample());
	}

	@Override
	public String getGardenApplyById(Integer id) {
		// TODO Auto-generated method stub
		GardenApply gardenApply = gardenApplyMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(gardenApply);
	}

	@Override
	public Result addGardenApply(GardenApply record) {
		// TODO Auto-generated method stub
		System.out.println(record.getFrontId());
		record.setGardenCheck(0);
		record.setGardenCreate(new Date());
		if (gardenApplyMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delGardenApply(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = gardenApplyMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateGardenApply(GardenApply record) {
		// TODO Auto-generated method stub
		GardenApply gardenApply = gardenApplyMapper.selectByPrimaryKey(record.getGardenId());
		gardenApply.setGardenAddress(record.getGardenAddress());
		gardenApply.setGardenArea(record.getGardenArea());
		gardenApply.setGardenCapital(record.getGardenCapital());
		gardenApply.setGardenCompany(record.getGardenCompany());
		gardenApply.setGardenDate(record.getGardenDate());
		gardenApply.setGardenDrma(record.getGardenDrma());
		gardenApply.setGardenHeadcount(record.getGardenHeadcount());
		gardenApply.setGardenIacr(record.getGardenIacr());
		gardenApply.setGardenIp(record.getGardenIp());
		gardenApply.setGardenLawcareer(record.getGardenLawcareer());
		gardenApply.setGardenLawperson(record.getGardenLawperson());
		gardenApply.setGardenLawphone(record.getGardenLawphone());
		gardenApply.setGardenLinkemail(record.getGardenLinkemail());
		gardenApply.setGardenLinkfax(record.getGardenLinkfax());
		gardenApply.setGardenLinkname(record.getGardenLinkname());
		gardenApply.setGardenLinkphone(record.getGardenLinkphone());
		gardenApply.setGardenPartner(record.getGardenPartner());
		gardenApply.setGardenProducts(record.getGardenProducts());
		gardenApply.setGardenRatal(record.getGardenRatal());
		gardenApply.setGardenRegistration(record.getGardenRegistration());
		gardenApply.setGardenRegtime(record.getGardenRegtime());
		gardenApply.setGardenSale(record.getGardenSale());
		gardenApply.setGardenUndergraduate(record.getGardenUndergraduate());
		gardenApply.setIndId(record.getIndId());
		gardenApply.setGardenUpdate(new Date());
		
		if (gardenApplyMapper.updateByPrimaryKey(gardenApply) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getGardenApplyInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		GardenApplyExample example = new  GardenApplyExample();
		example.setOrderByClause("garden_create desc");
		List<GardenApply> list = gardenApplyMapper.selectByExample(example);
		
		PageInfo<GardenApply> pageInfo = new PageInfo<>(list);
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
	public EasyUIDataGridResult LikeGardenApplyInfo(Integer page, Integer rows, String gardenCompany,
			Integer gardenCheck, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		System.out.println("gardenCompany:"+gardenCompany+",gardenCheck:"+gardenCheck+",startTime:"+startTime+",endTime:"+endTime);
		//分页处理
		PageHelper.startPage(page, rows);
		
		GardenApplyExample example = new GardenApplyExample();
		example.setOrderByClause("garden_create desc");
		GardenApplyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(gardenCompany)&&!gardenCompany.equals("null")) {
			criteria.andGardenCompanyLike("%"+gardenCompany+"%");
		}
		if(startTime!=null&&endTime!=null){
			criteria.andGardenCreateBetween(startTime, endTime);
		}
		if (gardenCheck != -1) {
			criteria.andGardenCheckEqualTo(gardenCheck);
		}
		
		
		List<GardenApply> list = gardenApplyMapper.selectByExample(example);
		
		PageInfo<GardenApply> pageInfo = new PageInfo<>(list);
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
	public List<GardenApply> getGardenByFrontId(Long id) {
		// TODO Auto-generated method stub
		GardenApplyExample example = new GardenApplyExample();
		GardenApplyExample.Criteria criteria = example.createCriteria();
		criteria.andFrontIdEqualTo(id);
		return gardenApplyMapper.selectByExample(example);
	}

}
