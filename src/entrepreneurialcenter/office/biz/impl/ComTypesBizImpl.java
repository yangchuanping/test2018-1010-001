package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComTypesBiz;
import entrepreneurialcenter.office.dao.ComTypesMapper;
import entrepreneurialcenter.office.pojo.ComTypes;
import entrepreneurialcenter.office.pojo.ComTypesExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ComTypesBizImpl implements IComTypesBiz {

	@Autowired
	private ComTypesMapper comTypesMapper;
	
	@Override
	public List<ComTypes> getAllComTypesInfo() {
		// TODO Auto-generated method stub
		ComTypesExample example = new ComTypesExample();
		ComTypesExample.Criteria criteria = example.createCriteria();
		criteria.andTypeStatusEqualTo("1");
		return comTypesMapper.selectByExample(example);
	}

	@Override
	public Integer getAllComTypesCount() {
		// TODO Auto-generated method stub
		return comTypesMapper.countByExample(new ComTypesExample());
	}

	@Override
	public String getComTypesById(Long id) {
		// TODO Auto-generated method stub
		ComTypes types = comTypesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(types);
	}

	@Override
	public Result addComTypes(ComTypes record) {
		// TODO Auto-generated method stub
		if (comTypesMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delComTypes(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = comTypesMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateComTypes(ComTypes record) {
		// TODO Auto-generated method stub
		ComTypes types = comTypesMapper.selectByPrimaryKey(record.getTypeId());
		//types.setCreated(record.getCreated());
		types.setTypeStatus(record.getTypeStatus());
		types.setTypeTitle(record.getTypeTitle());
		types.setUpdated(record.getUpdated());
		
		if (comTypesMapper.updateByPrimaryKey(types) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}
}
