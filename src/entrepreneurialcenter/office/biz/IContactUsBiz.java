package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ContactUs;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IContactUsBiz {

	//查询所有信息。
	List<ContactUs> getAllContactUsInfo();
	//查询所有条数。
	Integer getAllContactUsCount();
	//按ID查询单条信息。
	String getContactUsById(Integer id);
	//新增信息。
	Result addContactUs(ContactUs record);
	//删除信息。
	Result delContactUs(String id);
	//修改信息。
	Result updateContactUs(ContactUs record);
	//分页查询。
	EasyUIDataGridResult getContactUsInfo(Integer page, Integer rows);
	//模糊分页查询。
	EasyUIDataGridResult likeContactUsInfo(Integer page, Integer rows, Integer check, String value);
}
