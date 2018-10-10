package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComIndustriesBiz;
import entrepreneurialcenter.office.dao.ComIndustriesMapper;
import entrepreneurialcenter.office.pojo.ComIndustries;
import entrepreneurialcenter.office.pojo.ComIndustriesExample;
import entrepreneurialcenter.office.pojo.ComIndustriesExample.Criteria;
import entrepreneurialcenter.office.util.Result;

@Service
public class ComIndustriesBizImpl implements IComIndustriesBiz {

	@Autowired
	private ComIndustriesMapper comIndustriesMapper;
	
	@Override
	public List<ComIndustries> getAllComIndustriesInfo() {
		// TODO Auto-generated method stub
		ComIndustriesExample example = new ComIndustriesExample();
		Criteria criteria = example.createCriteria();
		criteria.andIndStatusEqualTo("1");
		return comIndustriesMapper.selectByExample(example);
	}

	@Override
	public Integer getAllComIndustriesCount() {
		// TODO Auto-generated method stub
		return comIndustriesMapper.countByExample(new ComIndustriesExample());
	}

	@Override
	public String getComIndustriesById(Long id) {
		// TODO Auto-generated method stub
		ComIndustries comIndustries = comIndustriesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(comIndustries);
	}

	@Override
	public Result addComIndustries(ComIndustries record) {
		// TODO Auto-generated method stub
		if (comIndustriesMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delComIndustries(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = comIndustriesMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateComIndustries(ComIndustries record) {
		// TODO Auto-generated method stub
		ComIndustries industries = comIndustriesMapper.selectByPrimaryKey(record.getIndId());
		//industries.setCreated(record.getCreated());
		industries.setIndStatus(record.getIndStatus());
		industries.setIndTitle(record.getIndTitle());
		industries.setUpdated(record.getUpdated());
		
		if (comIndustriesMapper.updateByPrimaryKey(industries) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}
}
