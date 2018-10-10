package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComIndustries;
import entrepreneurialcenter.office.util.Result;

public interface IComIndustriesBiz {
	
	//查询所有信息。
	List<ComIndustries> getAllComIndustriesInfo();
	//查询所有条数。
	Integer getAllComIndustriesCount();
	//按ID查询单条信息。
	String getComIndustriesById(Long id);
	//新增信息。
	Result addComIndustries(ComIndustries record);
	//删除信息。
	Result delComIndustries(String id);
	//修改信息。
	Result updateComIndustries(ComIndustries record);
	
}
