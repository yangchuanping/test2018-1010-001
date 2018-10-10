package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Message;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IMessageBiz {
	
	//查询所有信息。
	List<Message> getAllMessageInfo();
	//查询所有条数。
	Integer getAllMessageCount();
	//按ID查询单条信息。
	String getMessageById(Long id);
	//新增信息。
	Result addMessage(Message record);
	//删除信息。
	Result delMessage(String id);
	//修改信息。
	Result updateMessage(Message record);
	//分页查询。
	EasyUIDataGridResult getMessageInfo(Integer page, Integer rows);
	//分页查询按资讯类型。
	EasyUIDataGridResult getMessageInfoByType(Integer page, Integer rows, Integer type);
	//分页模糊查询所有。
	EasyUIDataGridResult likeMessageInfo(Integer page, Integer rows, String value, Integer type);
}
