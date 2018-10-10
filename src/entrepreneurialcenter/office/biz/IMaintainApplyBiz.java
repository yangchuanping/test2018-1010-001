package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.MaintainApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IMaintainApplyBiz {

	//查询所有信息。
	List<MaintainApply> getAllMaintainApplyInfo();
	//查询所有条数。
	Integer getAllMaintainApplyCount();
	//按ID查询单条信息。
	String getMaintainApplyById(Integer id);
	//新增信息。
	Result addMaintainApply(MaintainApply record);
	//删除信息。
	Result delMaintainApply(String id);
	//修改信息。
	Result updateMaintainApply(MaintainApply record);
	//分页查询。
	EasyUIDataGridResult getMaintainApplyInfo(Integer page, Integer rows);
	//分页模糊查询。
	EasyUIDataGridResult likeMaintainApplyInfo(Integer page, Integer rows, String value, String address, Integer check);
}
