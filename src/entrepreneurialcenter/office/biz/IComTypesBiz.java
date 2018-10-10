package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComTypes;
import entrepreneurialcenter.office.util.Result;

public interface IComTypesBiz {
	
	//查询所有信息。
	List<ComTypes> getAllComTypesInfo();
	//查询所有条数。
	Integer getAllComTypesCount();
	//按ID查询单条信息。
	String getComTypesById(Long id);
	//新增信息。
	Result addComTypes(ComTypes record);
	//删除信息。
	Result delComTypes(String id);
	//修改信息。
	Result updateComTypes(ComTypes record);
	
}
