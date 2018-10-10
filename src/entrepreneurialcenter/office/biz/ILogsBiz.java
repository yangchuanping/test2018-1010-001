package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Logs;
import entrepreneurialcenter.office.util.Result;

public interface ILogsBiz {
	
	//查询所有信息。
	List<Logs> getAllLogsInfo();
	//查询所有条数。
	Integer getAllLogsCount();
	//按ID查询单条信息。
	String getLogsById(Long id);
	//新增信息。
	Result addLogs(Logs record);
	//删除信息。
	Result delLogs(String id);
	//修改信息。
	Result updateLogs(Logs record);
	
}
