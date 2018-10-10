package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Companies;
import entrepreneurialcenter.office.pojo.impl.CompaniesInfo;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface ICompaniesBiz {
	
	//查询所有信息。
	List<CompaniesInfo> getAllCompaniesInfo();
	//查询所有条数。
	Integer getAllCompaniesCount();
	//按ID查询单条信息。
	String getCompaniesById(Long id);
	//新增信息。
	Result addCompanies(Companies record);
	//删除信息。
	Result delCompanies(String id);
	//修改信息。
	Result updateCompanies(Companies record);
	//分页查询
	EasyUIDataGridResult getCompaniesInfo(Integer page, Integer rows);
	//随机查询
	List<CompaniesInfo> RandSelectCompanies(Integer rows);
	//模糊查询
	List<CompaniesInfo> likeSelectCompanies(String value);
}
