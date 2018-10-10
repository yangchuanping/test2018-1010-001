package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ArtReceive;
import entrepreneurialcenter.office.util.Result;

public interface IArtReceiveBiz {
	
	//查询所有信息。
	List<ArtReceive> getAllArtReceiveInfo();
	//查询所有条数。
	Integer getAllArtReceiveCount();
	//按ID查询单条信息。
	String getArtReceiveById(Long id);
	//新增信息。
	Result addArtReceive(ArtReceive record);
	//删除信息。
	Result delArtReceive(String id);
	//修改信息。
	Result updateArtReceive(ArtReceive record);
}
