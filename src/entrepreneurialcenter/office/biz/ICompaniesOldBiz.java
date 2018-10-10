package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.CompaniesOld;
import entrepreneurialcenter.office.util.Result;

public interface ICompaniesOldBiz {
	
	//查询所有信息。
	List<CompaniesOld> getAllCompaniesOldInfo();
	//查询所有条数。
	Integer getAllCompaniesOldCount();
	//按ID查询单条信息。
	String getCompaniesOldById(Long id);
	//新增信息。
	Result addCompaniesOld(CompaniesOld record);
	//删除信息。
	Result delCompaniesOld(String id);
	//修改信息。
	Result updateCompaniesOld(CompaniesOld record);
	
}
