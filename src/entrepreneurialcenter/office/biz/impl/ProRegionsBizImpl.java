package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IProRegionsBiz;
import entrepreneurialcenter.office.dao.ProRegionsMapper;
import entrepreneurialcenter.office.pojo.ProRegions;
import entrepreneurialcenter.office.pojo.ProRegionsExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ProRegionsBizImpl implements IProRegionsBiz {

	@Autowired
	private ProRegionsMapper proRegionsMapper;
	
	@Override
	public List<ProRegions> getAllProRegionsInfo() {
		// TODO Auto-generated method stub
		ProRegionsExample example = new ProRegionsExample();
		ProRegionsExample.Criteria criteria = example.createCriteria();
		criteria.andRegionStatusEqualTo("1");
		return proRegionsMapper.selectByExample(example);
	}

	@Override
	public Integer getAllProRegionsCount() {
		// TODO Auto-generated method stub
		return proRegionsMapper.countByExample(new ProRegionsExample());
	}

	@Override
	public String getProRegionsById(Long id) {
		// TODO Auto-generated method stub
		ProRegions regions = proRegionsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(regions);
	}

	@Override
	public Result addProRegions(ProRegions record) {
		// TODO Auto-generated method stub
		int num = 1;
        double random = Math.random();
        if (random < 0.1) {
             random = random + 0.1;
        } for (int i = 0; i < 10; i++) {
             num = num * 10;
        }
        record.setRegionId((long) (random * num));
        record.setCreated((int) (System.currentTimeMillis()/1000));
        record.setRegionStatus("1");
		if (proRegionsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delProRegions(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = proRegionsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateProRegions(ProRegions record) {
		// TODO Auto-generated method stub
		ProRegions regions = proRegionsMapper.selectByPrimaryKey(record.getRegionId());
		regions.setRegionTitle(record.getRegionTitle());
		regions.setUpdated((int) (System.currentTimeMillis()/1000));
		if (proRegionsMapper.updateByPrimaryKey(regions) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public List<ProRegions> getProRegionsInfoByStatus() {
		// TODO Auto-generated method stub
		ProRegionsExample example = new ProRegionsExample();
		ProRegionsExample.Criteria criteria = example.createCriteria();
		criteria.andRegionStatusEqualTo("1");
		return proRegionsMapper.selectByExample(example);
	}
}
