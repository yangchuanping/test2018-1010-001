package entrepreneurialcenter.office.biz.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IContactUsBiz;
import entrepreneurialcenter.office.dao.ContactUsMapper;
import entrepreneurialcenter.office.pojo.ContactUs;
import entrepreneurialcenter.office.pojo.ContactUsExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class ContactUsBizImpl implements IContactUsBiz {

	@Autowired
	private ContactUsMapper contactUsMapper; 
	
	@Override
	public List<ContactUs> getAllContactUsInfo() {
		// TODO Auto-generated method stub
		return contactUsMapper.selectByExample(new ContactUsExample());
	}

	@Override
	public Integer getAllContactUsCount() {
		// TODO Auto-generated method stub
		return contactUsMapper.countByExample(new ContactUsExample());
	}

	@Override
	public String getContactUsById(Integer id) {
		// TODO Auto-generated method stub
		ContactUs contactUs = contactUsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(contactUs);
	}

	@Override
	public Result addContactUs(ContactUs record) {
		// TODO Auto-generated method stub
		record.setContactCheck(0);
		record.setContactCreate(new Date());
		if (contactUsMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delContactUs(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = contactUsMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateContactUs(ContactUs record) {
		// TODO Auto-generated method stub
		ContactUs contactUs = contactUsMapper.selectByPrimaryKey(record.getContactId());
		/*contactUs.setContactAddress(record.getContactAddress());
		contactUs.setContactContent(record.getContactContent());
		contactUs.setContactEmail(record.getContactEmail());
		contactUs.setContactName(record.getContactName());
		contactUs.setContactPhone(record.getContactPhone());*/
		contactUs.setContactCheck(record.getContactCheck());
		
		if (contactUsMapper.updateByPrimaryKey(contactUs) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getContactUsInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		ContactUsExample example = new ContactUsExample();
		example.setOrderByClause("contact_create desc");
		List<ContactUs> list = contactUsMapper.selectByExample(example);
		
		PageInfo<ContactUs> pageInfo = new PageInfo<>(list);
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
	public EasyUIDataGridResult likeContactUsInfo(Integer page, Integer rows, Integer check, String value) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		ContactUsExample example = new ContactUsExample();
		example.setOrderByClause("contact_create desc");
		ContactUsExample.Criteria criteria = example.createCriteria();
		if (check!=-1) {
			criteria.andContactCheckEqualTo(check);
		}
		if (StringUtils.isNotBlank(value)&&!value.equals("null")) {
			criteria.andContactContentLike("%"+value+"%");
		}
		
		
		List<ContactUs> list = contactUsMapper.selectByExample(example);
		
		PageInfo<ContactUs> pageInfo = new PageInfo<>(list);
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
