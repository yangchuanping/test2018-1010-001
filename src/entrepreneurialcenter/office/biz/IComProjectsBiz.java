package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComProjects;
import entrepreneurialcenter.office.util.Result;

public interface IComProjectsBiz {
	
	//查询所有信息。
	List<ComProjects> getAllComProjectsInfo();
	//查询所有条数。
	Integer getAllComProjectsCount();
	//按ID查询单条信息。
	String getComProjectsById(Long id);
	//新增信息。
	Result addComProjects(ComProjects record);
	//删除信息。
	Result delComProjects(String id);
	//修改信息。
	Result updateComProjects(ComProjects record);
	
}
