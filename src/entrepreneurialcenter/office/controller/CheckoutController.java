package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.ICheckoutBiz;
import entrepreneurialcenter.office.pojo.Checkout;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Checkout")
public class CheckoutController {

	@Autowired
	private ICheckoutBiz checkoutBiz;
	
	@RequestMapping("/getAllCheckout")
	@ResponseBody
	public List<Checkout> getAllCheckoutInfo(){
		return checkoutBiz.getAllCheckoutInfo();
	}
	
	@RequestMapping("/getAllCheckoutCount")
	@ResponseBody
	public String getAllCheckoutCount(){
		return JSON.toJSONString(checkoutBiz.getAllCheckoutCount());
	}
	
	@RequestMapping("/getCheckoutById")
	@ResponseBody
	public String getCheckoutById(Integer id){
		return checkoutBiz.getCheckoutById(id);
	}
	
	@RequestMapping("/addCheckout")
	@ResponseBody
	public Result addCheckout(Checkout record){
		return checkoutBiz.addCheckout(record);
	}
	
	@RequestMapping("/delCheckout")
	@ResponseBody
	public Result delCheckout(String id){
		return checkoutBiz.delCheckout(id);
	}
	
	@RequestMapping("/updateCheckout")
	@ResponseBody
	public Result updateCheckout(Checkout record){
		return checkoutBiz.updateCheckout(record);
	}
	
}
