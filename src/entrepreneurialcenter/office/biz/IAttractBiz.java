package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Attract;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IAttractBiz {

	//查询所有信息。
	List<Attract> getAllAttractInfo();
	//查询所有条数。
	Integer getAllAttractCount();
	//按ID查询单条信息。
	String getAttractById(Integer id);
	//新增信息。
	Result addAttract(Attract record);
	//删除信息。
	Result delAttract(String id);
	//修改信息。
	Result updateAttract(Attract record);
	//分页模糊查询。
	EasyUIDataGridResult likeAttractInfo(Integer page, Integer rows, String value, String garden, String area);
	//分页模糊查询。
	EasyUIDataGridResult likeAttractInfoBackPage(Integer page, Integer rows, String garden, String area, String status);
}
