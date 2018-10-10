package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IMessageBiz;
import entrepreneurialcenter.office.dao.MessageMapper;
import entrepreneurialcenter.office.pojo.Message;
import entrepreneurialcenter.office.pojo.MessageExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class MessageBizImpl implements IMessageBiz {

	@Autowired
	private MessageMapper messageMapper;
	
	@Override
	public List<Message> getAllMessageInfo() {
		// TODO Auto-generated method stub
		return messageMapper.selectByExample(new MessageExample());
	}

	@Override
	public Integer getAllMessageCount() {
		// TODO Auto-generated method stub
		return messageMapper.countByExample(new MessageExample());
	}

	@Override
	public String getMessageById(Long id) {
		// TODO Auto-generated method stub
		Message projects = messageMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(projects);
	}

	@Override
	public Result addMessage(Message record) {
		// TODO Auto-generated method stub
		record.setMsgCreated((int) (System.currentTimeMillis()/1000));
		if (messageMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delMessage(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = messageMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateMessage(Message record) {
		// TODO Auto-generated method stub
		Message message = messageMapper.selectByPrimaryKey(record.getMsgId());
		message.setMsgUpdate((int) (System.currentTimeMillis()/1000));
		message.setMsgContent(record.getMsgContent());
		message.setMsgTitle(record.getMsgTitle());
		message.setMsgType(record.getMsgType());
		
		if (messageMapper.updateByPrimaryKey(message) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getMessageInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		
		MessageExample example = new MessageExample();
		example.setOrderByClause("msg_created desc");
		List<Message> list = messageMapper.selectByExample(example);
		PageInfo<Message> pageInfo = new PageInfo<>(list);
		
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
		long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
		
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
		
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

	@Override
	public EasyUIDataGridResult getMessageInfoByType(Integer page, Integer rows, Integer type) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		//条件查询
		MessageExample example = new MessageExample();
		example.setOrderByClause("msg_created desc");
		MessageExample.Criteria criteria = example.createCriteria();
		criteria.andMsgTypeEqualTo(type);
		
		List<Message> list = messageMapper.selectByExample(example);
		PageInfo<Message> pageInfo = new PageInfo<>(list);
		
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
		long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
		
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
		
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

	@Override
	public EasyUIDataGridResult likeMessageInfo(Integer page, Integer rows, String value, Integer type) {
		// TODO Auto-generated method stub
		System.out.println("value:"+value+"type:"+type);
		//分页处理
		PageHelper.startPage(page, rows);
		//条件查询
		MessageExample example = new MessageExample();
		example.setOrderByClause("msg_created desc");
		MessageExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(value)&&!value.equals("null")) {
			criteria.andMsgTitleLike("%"+value+"%");
		}
		if (type!=0&&type!=null) {
			criteria.andMsgTypeEqualTo(type);
		}
		
		List<Message> list = messageMapper.selectByExample(example);
		PageInfo<Message> pageInfo = new PageInfo<>(list);
		
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
		long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
		
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
		
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

}
