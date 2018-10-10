package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ProLeaseholds;
import entrepreneurialcenter.office.util.Result;

public interface IProLeaseholdsBiz {
	
	//查询所有信息。
	List<ProLeaseholds> getAllProLeaseholdsInfo();
	//查询所有条数。
	Integer getAllProLeaseholdsCount();
	//按ID查询单条信息。
	String getProLeaseholdsById(Long id);
	//新增信息。
	Result addProLeaseholds(ProLeaseholds record);
	//删除信息。
	Result delProLeaseholds(String id);
	//修改信息。
	Result updateProLeaseholds(ProLeaseholds record);
	
}
