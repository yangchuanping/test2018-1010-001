package entrepreneurialcenter.office.biz;

import java.util.Date;
import java.util.List;

import entrepreneurialcenter.office.pojo.GardenApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IGardenApplyBiz {

	//查询所有信息。
	List<GardenApply> getAllGardenApplyInfo();
	//查询所有条数。
	Integer getAllGardenApplyCount();
	//按ID查询单条信息。
	String getGardenApplyById(Integer id);
	//新增信息。
	Result addGardenApply(GardenApply record);
	//删除信息。
	Result delGardenApply(String id);
	//修改信息。
	Result updateGardenApply(GardenApply record);
	//分页查询。
	EasyUIDataGridResult getGardenApplyInfo(Integer page, Integer rows);
	//模糊分页查询。
	EasyUIDataGridResult LikeGardenApplyInfo(Integer page, Integer rows, String gardenCompany, Integer gardenCheck, Date startTime, Date endTime);
	//按前端用户Id查询所有信息。
	List<GardenApply> getGardenByFrontId(Long id);
}
