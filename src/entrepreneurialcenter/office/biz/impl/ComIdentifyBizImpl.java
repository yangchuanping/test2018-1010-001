package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComIdentifyBiz;
import entrepreneurialcenter.office.dao.ComIdentifyMapper;
import entrepreneurialcenter.office.pojo.ComIdentify;
import entrepreneurialcenter.office.pojo.ComIdentifyExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ComIdentifyBizImpl implements IComIdentifyBiz {

	@Autowired
	private ComIdentifyMapper comIdentifyMapper;
	
	@Override
	public List<ComIdentify> getAllComIdentifyInfo() {
		// TODO Auto-generated method stub
		ComIdentifyExample example = new ComIdentifyExample();
		ComIdentifyExample.Criteria criteria = example.createCriteria();
		criteria.andIdeStatusEqualTo("1");
		return comIdentifyMapper.selectByExample(example);
	}

	@Override
	public Integer getAllComIdentifyCount() {
		// TODO Auto-generated method stub
		return comIdentifyMapper.countByExample(new ComIdentifyExample());
	}

	@Override
	public String getComIdentifyById(Long id) {
		// TODO Auto-generated method stub
		ComIdentify comIdentify = comIdentifyMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(comIdentify);
	}

	@Override
	public Result addComIdentify(ComIdentify record) {
		// TODO Auto-generated method stub
		if (comIdentifyMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delComIdentify(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = comIdentifyMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateComIdentify(ComIdentify record) {
		// TODO Auto-generated method stub
		ComIdentify identify = comIdentifyMapper.selectByPrimaryKey(record.getIdeId());
		//identify.setCreated(record.getCreated());
		identify.setIdeStatus(record.getIdeStatus());
		identify.setIdeTitle(record.getIdeTitle());
		identify.setUpdated(record.getUpdated());
		
		if (comIdentifyMapper.updateByPrimaryKey(identify) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
