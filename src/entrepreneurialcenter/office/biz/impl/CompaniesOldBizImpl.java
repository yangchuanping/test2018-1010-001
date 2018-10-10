package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ICompaniesOldBiz;
import entrepreneurialcenter.office.dao.CompaniesOldMapper;
import entrepreneurialcenter.office.pojo.CompaniesOld;
import entrepreneurialcenter.office.pojo.CompaniesOldExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class CompaniesOldBizImpl implements ICompaniesOldBiz {

	@Autowired
	private CompaniesOldMapper companiesOldMapper;
	
	@Override
	public List<CompaniesOld> getAllCompaniesOldInfo() {
		// TODO Auto-generated method stub
		return companiesOldMapper.selectByExample(new CompaniesOldExample());
	}

	@Override
	public Integer getAllCompaniesOldCount() {
		// TODO Auto-generated method stub
		return companiesOldMapper.countByExample(new CompaniesOldExample());
	}

	@Override
	public String getCompaniesOldById(Long id) {
		// TODO Auto-generated method stub
		CompaniesOld companiesOld = companiesOldMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(companiesOld);
	}

	@Override
	public Result addCompaniesOld(CompaniesOld record) {
		// TODO Auto-generated method stub
		if (companiesOldMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delCompaniesOld(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = companiesOldMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateCompaniesOld(CompaniesOld record) {
		// TODO Auto-generated method stub
		CompaniesOld old = companiesOldMapper.selectByPrimaryKey(record.getComId());
		old.setComAbout(record.getComAbout());
		old.setComDetail(record.getComDetail());
		old.setComName(record.getComName());
		old.setComNumber(record.getComNumber());
		old.setComPatent(record.getComPatent());
		old.setComProduct(record.getComProduct());
		old.setComStatus(record.getComStatus());
		//old.setCreated(record.getCreated());
		old.setIdeId(record.getIdeId());
		old.setIndId(record.getIndId());
		old.setModeId(record.getModeId());
		old.setTypeId(record.getTypeId());
		old.setUpdated(record.getUpdated());
		
		if (companiesOldMapper.updateByPrimaryKey(old) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
