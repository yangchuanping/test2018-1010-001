package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IProBuildingsBiz;
import entrepreneurialcenter.office.dao.ProBuildingsMapper;
import entrepreneurialcenter.office.pojo.ProBuildings;
import entrepreneurialcenter.office.pojo.ProBuildingsExample;
import entrepreneurialcenter.office.pojo.impl.ProBuiReg;
import entrepreneurialcenter.office.util.Result;

@Service
public class ProBuildingsBizImpl implements IProBuildingsBiz {

	@Autowired
	private ProBuildingsMapper proBuildingsMapper;
	
	@Override
	public List<ProBuildings> getAllProBuildingsInfo() {
		// TODO Auto-generated method stub
		return proBuildingsMapper.selectByExample(new ProBuildingsExample());
	}

	@Override
	public Integer getAllProBuildingsCount() {
		// TODO Auto-generated method stub
		return proBuildingsMapper.countByExample(new ProBuildingsExample());
	}

	@Override
	public String getProBuildingsById(Long id) {
		// TODO Auto-generated method stub
		ProBuildings buildings = proBuildingsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(buildings);
	}

	@Override
	public Result addProBuildings(ProBuildings record) {
		// TODO Auto-generated method stub
		int num = 1;
        double random = Math.random();
        if (random < 0.1) {
             random = random + 0.1;
        } for (int i = 0; i < 10; i++) {
             num = num * 10;
        }
		record.setBuildingId((long) (random * num));
		record.setBuildingStatus("1");
		record.setCreated((int) (System.currentTimeMillis()/1000));
		if (proBuildingsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delProBuildings(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = proBuildingsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateProBuildings(ProBuildings record) {
		// TODO Auto-generated method stub
		ProBuildings buildings = proBuildingsMapper.selectByPrimaryKey(record.getBuildingId());
		buildings.setBuildingTitle(record.getBuildingTitle());
		buildings.setRegionId(record.getRegionId());
		buildings.setUpdated((int) (System.currentTimeMillis()/1000));
		
		if (proBuildingsMapper.updateByPrimaryKey(buildings) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public List<ProBuiReg> getProBuiReg() {
		// TODO Auto-generated method stub
		return proBuildingsMapper.selectProBuiReg();
	}

	@Override
	public List<ProBuildings> getBuiByReg(Long id) {
		// TODO Auto-generated method stub
		ProBuildingsExample example = new ProBuildingsExample();
		ProBuildingsExample.Criteria criteria = example.createCriteria();
		criteria.andRegionIdEqualTo(id);
		return proBuildingsMapper.selectByExample(example);
	}
}
