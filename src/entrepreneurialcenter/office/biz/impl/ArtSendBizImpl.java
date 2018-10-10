package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IArtSendBiz;
import entrepreneurialcenter.office.dao.ArtSendMapper;
import entrepreneurialcenter.office.pojo.ArtSend;
import entrepreneurialcenter.office.pojo.ArtSendExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ArtSendBizImpl implements IArtSendBiz {

	@Autowired
	private ArtSendMapper artSendMapper;
	
	@Override
	public List<ArtSend> getAllArtSendInfo() {
		// TODO Auto-generated method stub
		return artSendMapper.selectByExample(new ArtSendExample());
	}

	@Override
	public Integer getAllArtSendCount() {
		// TODO Auto-generated method stub
		return artSendMapper.countByExample(new ArtSendExample());
	}

	@Override
	public String getArtSendById(Long id) {
		// TODO Auto-generated method stub
		ArtSend artSend = artSendMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(artSend);
	}

	@Override
	public Result addArtSend(ArtSend record) {
		// TODO Auto-generated method stub
		if (artSendMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delArtSend(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = artSendMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateArtSend(ArtSend record) {
		// TODO Auto-generated method stub
		ArtSend artSend = artSendMapper.selectByPrimaryKey(record.getSendId());
		artSend.setArtId(record.getArtId());
		//artSend.setCreated(record.getCreated());
		artSend.setStatus(record.getStatus());
		artSend.setUserId(record.getUserId());
		
		if (artSendMapper.updateByPrimaryKey(artSend) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
