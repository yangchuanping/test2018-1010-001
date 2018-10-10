package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComModes;
import entrepreneurialcenter.office.util.Result;

public interface IComModesBiz {
	
	//查询所有信息。
	List<ComModes> getAllComModesInfo();
	//查询所有条数。
	Integer getAllComModesCount();
	//按ID查询单条信息。
	String getComModesById(Long id);
	//新增信息。
	Result addComModes(ComModes record);
	//删除信息。
	Result delComModes(String id);
	//修改信息。
	Result updateComModes(ComModes record);
	
}
