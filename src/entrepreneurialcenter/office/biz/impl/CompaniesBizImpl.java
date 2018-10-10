package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.ICompaniesBiz;
import entrepreneurialcenter.office.dao.CompaniesMapper;
import entrepreneurialcenter.office.pojo.Companies;
import entrepreneurialcenter.office.pojo.CompaniesExample;
import entrepreneurialcenter.office.pojo.impl.CompaniesInfo;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class CompaniesBizImpl implements ICompaniesBiz {

	@Autowired
	private CompaniesMapper companiesMapper;
	
	@Override
	public List<CompaniesInfo> getAllCompaniesInfo() {
		// TODO Auto-generated method stub
		return companiesMapper.selectCompaniesInfo();
	}

	@Override
	public Integer getAllCompaniesCount() {
		// TODO Auto-generated method stub
		return companiesMapper.countByExample(new CompaniesExample());
	}

	@Override
	public String getCompaniesById(Long id) {
		// TODO Auto-generated method stub
		Companies companies = companiesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(companies);
	}

	@Override
	public Result addCompanies(Companies record) {
		// TODO Auto-generated method stub
		if (companiesMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delCompanies(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = companiesMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateCompanies(Companies record) {
		// TODO Auto-generated method stub
		Companies companies = companiesMapper.selectByPrimaryKey(record.getComId());
		companies.setComName(record.getComName());
		companies.setTypeId(record.getTypeId());
		companies.setIndId(record.getIndId());
		companies.setRegionId(record.getRegionId());
		companies.setModeId(record.getModeId());
		companies.setIdeId(record.getIdeId());
		companies.setJoinDmt(record.getJoinDmt());
		companies.setRetakeDmt(record.getRetakeDmt());
		companies.setComDetail(record.getComDetail());
		companies.setComPatent(record.getComPatent());
		companies.setComAbout(record.getComAbout());
		companies.setUpdated((int) (System.currentTimeMillis()/1000));
		
		if (companiesMapper.updateByPrimaryKey(companies) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getCompaniesInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		
		List<CompaniesInfo> list = companiesMapper.selectCompaniesInfo();
		
		PageInfo<CompaniesInfo> pageInfo = new PageInfo<>(list);
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
	public List<CompaniesInfo> RandSelectCompanies(Integer rows) {
		// TODO Auto-generated method stub
		return companiesMapper.RandSelectCompanies(rows);
	}

	@Override
	public List<CompaniesInfo> likeSelectCompanies(String value) {
		// TODO Auto-generated method stub
		return companiesMapper.likeSelectCompanies(value);
	}

}
