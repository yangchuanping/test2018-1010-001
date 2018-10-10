package entrepreneurialcenter.office.biz;

import java.util.Date;
import java.util.List;

import entrepreneurialcenter.office.pojo.QuitApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IQuitApplyBiz {

	//查询所有信息。
	List<QuitApply> getAllQuitApplyInfo();
	//查询所有条数。
	Integer getAllQuitApplyCount();
	//按ID查询单条信息。
	String getQuitApplyById(Integer id);
	//新增信息。
	Result addQuitApply(QuitApply record);
	//删除信息。
	Result delQuitApply(String id);
	//修改信息。
	Result updateQuitApply(QuitApply record);
	//分页查询。
	EasyUIDataGridResult getQuitApplyInfo(Integer page, Integer rows);
	//分页模糊查询。
	EasyUIDataGridResult likeQuitApplyInfo(Integer page, Integer rows, String quitCompany, Integer quitCheck, Date startTime, Date endTime);
}
