package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Departments;
import entrepreneurialcenter.office.util.Result;

public interface IDepartmentsBiz {
	
	//查询所有信息。
	List<Departments> getAllDepartmentsInfo();
	//查询所有条数。
	Integer getAllDepartmentsCount();
	//按ID查询单条信息。
	String getDepartmentsById(Long id);
	//新增信息。
	Result addDepartments(Departments record);
	//删除信息。
	Result delDepartments(String id);
	//修改信息。
	Result updateDepartments(Departments record);
	
}
