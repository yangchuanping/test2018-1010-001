package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComModesBiz;
import entrepreneurialcenter.office.dao.ComModesMapper;
import entrepreneurialcenter.office.pojo.ComModes;
import entrepreneurialcenter.office.pojo.ComModesExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ComModesBizImpl implements IComModesBiz {

	@Autowired
	private ComModesMapper comModesMapper;
	
	@Override
	public List<ComModes> getAllComModesInfo() {
		// TODO Auto-generated method stub
		ComModesExample example = new ComModesExample();
		ComModesExample.Criteria criteria = example.createCriteria();
		criteria.andModeStatusEqualTo("1");
		return comModesMapper.selectByExample(example);
	}

	@Override
	public Integer getAllComModesCount() {
		// TODO Auto-generated method stub
		return comModesMapper.countByExample(new ComModesExample());
	}

	@Override
	public String getComModesById(Long id) {
		// TODO Auto-generated method stub
		ComModes comModes = comModesMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(comModes);
	}

	@Override
	public Result addComModes(ComModes record) {
		// TODO Auto-generated method stub
		if (comModesMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delComModes(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = comModesMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateComModes(ComModes record) {
		// TODO Auto-generated method stub
		ComModes modes = comModesMapper.selectByPrimaryKey(record.getModeId());
		//modes.setCreated(record.getCreated());
		modes.setModeStatus(record.getModeStatus());
		modes.setModeTitle(record.getModeTitle());
		modes.setUpdated(record.getUpdated());
		
		if (comModesMapper.updateByPrimaryKey(modes) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
