package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComBorrowingsBiz;
import entrepreneurialcenter.office.dao.ComBorrowingsMapper;
import entrepreneurialcenter.office.pojo.ComBorrowings;
import entrepreneurialcenter.office.pojo.ComBorrowingsExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ComBorrowingsBizImpl implements IComBorrowingsBiz {

	@Autowired
	private ComBorrowingsMapper comBorrowingsMapper;
	
	@Override
	public List<ComBorrowings> getAllComBorrowingsInfo() {
		// TODO Auto-generated method stub
		return comBorrowingsMapper.selectByExample(new ComBorrowingsExample());
	}

	@Override
	public Integer getAllComBorrowingsCount() {
		// TODO Auto-generated method stub
		return comBorrowingsMapper.countByExample(new ComBorrowingsExample());
	}

	@Override
	public String getComBorrowingsById(Long id) {
		// TODO Auto-generated method stub
		ComBorrowings borrowings = comBorrowingsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(borrowings);
	}

	@Override
	public Result addComBorrowings(ComBorrowings record) {
		// TODO Auto-generated method stub
		if (comBorrowingsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delComBorrowings(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = comBorrowingsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateComBorrowings(ComBorrowings record) {
		// TODO Auto-generated method stub
		ComBorrowings borrowings = comBorrowingsMapper.selectByPrimaryKey(record.getBorrowId());
		borrowings.setBorrowDate(record.getBorrowDate());
		borrowings.setBorrowDeadline(record.getBorrowDeadline());
		borrowings.setBorrowHkq(record.getBorrowHkq());
		borrowings.setBorrowMoney(record.getBorrowMoney());
		borrowings.setBorrowRate(record.getBorrowRate());
		borrowings.setBorrowRenew(record.getBorrowRenew());
		borrowings.setBorrowRenewhkq(record.getBorrowRenewhkq());
		borrowings.setBorrowRenewrate(record.getBorrowRenewrate());
		borrowings.setBorrowSjhkq(record.getBorrowSjhkq());
		borrowings.setBorrowStatus(record.getBorrowStatus());
		borrowings.setComId(record.getComId());
		borrowings.setUpdated(record.getUpdated());
		
		if (comBorrowingsMapper.updateByPrimaryKey(borrowings) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
