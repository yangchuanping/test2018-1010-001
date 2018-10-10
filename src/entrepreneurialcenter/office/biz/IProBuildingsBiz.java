package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ProBuildings;
import entrepreneurialcenter.office.pojo.impl.ProBuiReg;
import entrepreneurialcenter.office.util.Result;

public interface IProBuildingsBiz {
	
	//查询所有信息。
	List<ProBuildings> getAllProBuildingsInfo();
	//查询所有条数。
	Integer getAllProBuildingsCount();
	//按ID查询单条信息。
	String getProBuildingsById(Long id);
	//新增信息。
	Result addProBuildings(ProBuildings record);
	//删除信息。
	Result delProBuildings(String id);
	//修改信息。
	Result updateProBuildings(ProBuildings record);
	//联表查询
	List<ProBuiReg> getProBuiReg();
	//按园区id查全部楼宇
	List<ProBuildings> getBuiByReg(Long id);
}
