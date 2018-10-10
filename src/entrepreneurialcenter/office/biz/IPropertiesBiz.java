package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Properties;
import entrepreneurialcenter.office.util.Result;

public interface IPropertiesBiz {
	
	//查询所有信息。
	List<Properties> getAllPropertiesInfo();
	//查询所有条数。
	Integer getAllPropertiesCount();
	//按ID查询单条信息。
	String getPropertiesById(Long id);
	//新增信息。
	Result addProperties(Properties record);
	//删除信息。
	Result delProperties(String id);
	//修改信息。
	Result updateProperties(Properties record);
	
}
