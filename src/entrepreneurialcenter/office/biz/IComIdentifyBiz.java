package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComIdentify;
import entrepreneurialcenter.office.util.Result;

public interface IComIdentifyBiz {
	
	//查询所有信息。
	List<ComIdentify> getAllComIdentifyInfo();
	//查询所有条数。
	Integer getAllComIdentifyCount();
	//按ID查询单条信息。
	String getComIdentifyById(Long id);
	//新增信息。
	Result addComIdentify(ComIdentify record);
	//删除信息。
	Result delComIdentify(String id);
	//修改信息。
	Result updateComIdentify(ComIdentify record);
	
}
