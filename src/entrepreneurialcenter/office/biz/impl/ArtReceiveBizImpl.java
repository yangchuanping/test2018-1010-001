package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IArtReceiveBiz;
import entrepreneurialcenter.office.dao.ArtReceiveMapper;
import entrepreneurialcenter.office.pojo.ArtReceive;
import entrepreneurialcenter.office.pojo.ArtReceiveExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ArtReceiveBizImpl implements IArtReceiveBiz {

	@Autowired
	private ArtReceiveMapper artReceiveMapper;
	
	@Override
	public List<ArtReceive> getAllArtReceiveInfo() {
		// TODO Auto-generated method stub
		return artReceiveMapper.selectByExample(new ArtReceiveExample());
	}

	@Override
	public Integer getAllArtReceiveCount() {
		// TODO Auto-generated method stub
		return artReceiveMapper.countByExample(new ArtReceiveExample());
	}

	@Override
	public String getArtReceiveById(Long id) {
		// TODO Auto-generated method stub
		ArtReceive artReceive = artReceiveMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(artReceive);
	}

	@Override
	public Result addArtReceive(ArtReceive record) {
		// TODO Auto-generated method stub
		if (artReceiveMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delArtReceive(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = artReceiveMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateArtReceive(ArtReceive record) {
		// TODO Auto-generated method stub
		ArtReceive artReceive = artReceiveMapper.selectByPrimaryKey(record.getReceiveId());
		artReceive.setArtId(record.getArtId());
		//artReceive.setCreated(record.getCreated());
		artReceive.setStatus(record.getStatus());
		artReceive.setUpdated(record.getUpdated());
		artReceive.setUserId(record.getUserId());
		
		if (artReceiveMapper.updateByPrimaryKey(artReceive) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
