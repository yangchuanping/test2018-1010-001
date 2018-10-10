package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ProRegions;
import entrepreneurialcenter.office.util.Result;

public interface IProRegionsBiz {
	
	//查询所有信息。
	List<ProRegions> getAllProRegionsInfo();
	//查询可显示的信息。
	List<ProRegions> getProRegionsInfoByStatus();
	//查询所有条数。
	Integer getAllProRegionsCount();
	//按ID查询单条信息。
	String getProRegionsById(Long id);
	//新增信息。
	Result addProRegions(ProRegions record);
	//删除信息。
	Result delProRegions(String id);
	//修改信息。
	Result updateProRegions(ProRegions record);
	
}
