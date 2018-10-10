package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ILogsBiz;
import entrepreneurialcenter.office.dao.LogsMapper;
import entrepreneurialcenter.office.pojo.Logs;
import entrepreneurialcenter.office.pojo.LogsExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class LogsBizImpl implements ILogsBiz {

	@Autowired
	private LogsMapper logsMapper;
	
	@Override
	public List<Logs> getAllLogsInfo() {
		// TODO Auto-generated method stub
		return logsMapper.selectByExample(new LogsExample());
	}

	@Override
	public Integer getAllLogsCount() {
		// TODO Auto-generated method stub
		return logsMapper.countByExample(new LogsExample());
	}

	@Override
	public String getLogsById(Long id) {
		// TODO Auto-generated method stub
		Logs logs = logsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(logs);
	}

	@Override
	public Result addLogs(Logs record) {
		// TODO Auto-generated method stub
		if (logsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delLogs(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = logsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateLogs(Logs record) {
		// TODO Auto-generated method stub
		Logs logs = logsMapper.selectByPrimaryKey(record.getLogId());
		//logs.setCreated(record.getCreated());
		logs.setLogContent(record.getLogContent());
		logs.setLogPostsrc(record.getLogPostsrc());
		logs.setUserId(record.getUserId());
		
		if (logsMapper.updateByPrimaryKey(logs) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
