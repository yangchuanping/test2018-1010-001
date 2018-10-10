package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IProLeaseholdsBiz;
import entrepreneurialcenter.office.dao.ProLeaseholdsMapper;
import entrepreneurialcenter.office.pojo.ProLeaseholds;
import entrepreneurialcenter.office.pojo.ProLeaseholdsExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ProLeaseholdsBizImpl implements IProLeaseholdsBiz {

	@Autowired
	private ProLeaseholdsMapper proLeaseholdsMapper;
	
	@Override
	public List<ProLeaseholds> getAllProLeaseholdsInfo() {
		// TODO Auto-generated method stub
		return proLeaseholdsMapper.selectByExample(new ProLeaseholdsExample());
	}

	@Override
	public Integer getAllProLeaseholdsCount() {
		// TODO Auto-generated method stub
		return proLeaseholdsMapper.countByExample(new ProLeaseholdsExample());
	}

	@Override
	public String getProLeaseholdsById(Long id) {
		// TODO Auto-generated method stub
		ProLeaseholds leaseholds = proLeaseholdsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(leaseholds);
	}

	@Override
	public Result addProLeaseholds(ProLeaseholds record) {
		// TODO Auto-generated method stub
		if (proLeaseholdsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delProLeaseholds(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = proLeaseholdsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateProLeaseholds(ProLeaseholds record) {
		// TODO Auto-generated method stub
		ProLeaseholds leaseholds = proLeaseholdsMapper.selectByPrimaryKey(record.getLeaId());
		leaseholds.setComId(record.getComId());
		//leaseholds.setCreated(record.getCreated());
		leaseholds.setLeaDetail(record.getLeaDetail());
		leaseholds.setLeaStatus(record.getLeaStatus());
		leaseholds.setProId(record.getProId());
		leaseholds.setTimeEnd(record.getTimeEnd());
		leaseholds.setTimeStart(record.getTimeStart());
		leaseholds.setUpdated(record.getUpdated());
		
		if (proLeaseholdsMapper.updateByPrimaryKey(leaseholds) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}
}
