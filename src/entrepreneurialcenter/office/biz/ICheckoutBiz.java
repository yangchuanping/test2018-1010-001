package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Checkout;
import entrepreneurialcenter.office.util.Result;

public interface ICheckoutBiz {
	
	//查询所有信息。
	List<Checkout> getAllCheckoutInfo();
	//查询所有条数。
	Integer getAllCheckoutCount();
	//按ID查询单条信息。
	String getCheckoutById(Integer id);
	//新增信息。
	Result addCheckout(Checkout record);
	//删除信息。
	Result delCheckout(String id);
	//修改信息。
	Result updateCheckout(Checkout record);
	
}
