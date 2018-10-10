package entrepreneurialcenter.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IPartnerBiz;
import entrepreneurialcenter.office.pojo.Partner;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Controller
@RequestMapping("/Partner")
public class PartnerController {

	@Autowired
	private IPartnerBiz partnerBiz;

	@RequestMapping("/getAllPartnerInfo")
	@ResponseBody
	public List<Partner> getAllPartnerInfo() {
		return partnerBiz.getAllPartnerInfo();
	}

	@RequestMapping("/getAllPartnerCount")
	@ResponseBody
	public String getAllPartnerCount() {
		return JSON.toJSONString(partnerBiz.getAllPartnerCount());
	}

	@RequestMapping("/getPartnerById")
	@ResponseBody
	public String getPartnerById(Long id) {
		return partnerBiz.getPartnerById(id);
	}

	@RequestMapping("/addPartner")
	@ResponseBody
	public Result addPartner(Partner record) {
		return partnerBiz.addPartner(record);
	}

	@RequestMapping("/delPartner")
	@ResponseBody
	public Result delPartner(String id) {
		return partnerBiz.delPartner(id);
	}

	@RequestMapping("/updatePartner")
	@ResponseBody
	public Result updatePartner(Partner record) {
		return partnerBiz.updatePartner(record);
	}
	
	@RequestMapping("/likePartnerInfo")
	@ResponseBody
	public EasyUIDataGridResult likePartnerInfo(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer rows, String value, String indString) {
		return partnerBiz.likePartnerInfo(page, rows, value, indString);
	}
	
	@RequestMapping("/likePartnerAllInfo")
	@ResponseBody
	List<Partner> likePartnerAllInfo(String value){
		return partnerBiz.likePartnerAllInfo(value);
 	} 
}
