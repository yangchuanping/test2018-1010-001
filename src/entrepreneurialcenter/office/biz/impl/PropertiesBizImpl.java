package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IPropertiesBiz;
import entrepreneurialcenter.office.dao.PropertiesMapper;
import entrepreneurialcenter.office.pojo.Properties;
import entrepreneurialcenter.office.pojo.PropertiesExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class PropertiesBizImpl implements IPropertiesBiz {

	@Autowired
	private PropertiesMapper propertiesMapper;
	
	@Override
	public List<Properties> getAllPropertiesInfo() {
		// TODO Auto-generated method stub
		return propertiesMapper.selectByExample(new PropertiesExample());
	}

	@Override
	public Integer getAllPropertiesCount() {
		// TODO Auto-generated method stub
		return propertiesMapper.countByExample(new PropertiesExample());
	}

	@Override
	public String getPropertiesById(Long id) {
		// TODO Auto-generated method stub
		Properties properties = propertiesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(properties);
	}

	@Override
	public Result addProperties(Properties record) {
		// TODO Auto-generated method stub
		if (propertiesMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delProperties(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = propertiesMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateProperties(Properties record) {
		// TODO Auto-generated method stub
		Properties properties = propertiesMapper.selectByPrimaryKey(record.getProId());
		properties.setApplyTime(record.getApplyTime());
		properties.setBuildingId(record.getBuildingId());
		//properties.setCreated(record.getCreated());
		properties.setProAmmeter(record.getProAmmeter());
		properties.setProArea(record.getProArea());
		properties.setProNumber(record.getProNumber());
		properties.setProStatus(record.getProStatus());
		properties.setProType(record.getProType());
		properties.setProUnivalent(record.getProUnivalent());
		properties.setRegionId(record.getRegionId());
		properties.setRemark(record.getRemark());
		properties.setUpdated(record.getUpdated());
		
		if (propertiesMapper.updateByPrimaryKey(properties) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}
}
