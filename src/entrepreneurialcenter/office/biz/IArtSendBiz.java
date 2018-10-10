package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ArtSend;
import entrepreneurialcenter.office.util.Result;

public interface IArtSendBiz {
	
	//查询所有信息。
	List<ArtSend> getAllArtSendInfo();
	//查询所有条数。
	Integer getAllArtSendCount();
	//按ID查询单条信息。
	String getArtSendById(Long id);
	//新增信息。
	Result addArtSend(ArtSend record);
	//删除信息。
	Result delArtSend(String id);
	//修改信息。
	Result updateArtSend(ArtSend record);
	
}
