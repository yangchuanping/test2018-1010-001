package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ICheckoutBiz;
import entrepreneurialcenter.office.dao.CheckoutMapper;
import entrepreneurialcenter.office.pojo.Checkout;
import entrepreneurialcenter.office.pojo.CheckoutExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class CheckoutBizImpl implements ICheckoutBiz {

	@Autowired
	private CheckoutMapper checkoutMapper;
	
	@Override
	public List<Checkout> getAllCheckoutInfo() {
		// TODO Auto-generated method stub
		return checkoutMapper.selectByExample(new CheckoutExample());
	}

	@Override
	public Integer getAllCheckoutCount() {
		// TODO Auto-generated method stub
		return checkoutMapper.countByExample(new CheckoutExample());
	}

	@Override
	public String getCheckoutById(Integer id) {
		// TODO Auto-generated method stub
		Checkout checkout = checkoutMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(checkout);
	}

	@Override
	public Result addCheckout(Checkout record) {
		// TODO Auto-generated method stub
		if (checkoutMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delCheckout(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = checkoutMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateCheckout(Checkout record) {
		// TODO Auto-generated method stub
		Checkout checkout = checkoutMapper.selectByPrimaryKey(record.getId());
		checkout.setAddress(record.getAddress());
		checkout.setCheckoutDmt(record.getCheckoutDmt());
		checkout.setContact(record.getContact());
		//checkout.setCreated(record.getCreated());
		checkout.setItemId(record.getItemId());
		checkout.setItemName(record.getItemName());
		checkout.setReasonsText(record.getReasonsText());
		checkout.setReasonsType(record.getReasonsType());
		checkout.setUpdated(record.getUpdated());
		
		if (checkoutMapper.updateByPrimaryKey(checkout) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
