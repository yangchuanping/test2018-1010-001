package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ContactUs;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IContactUsBiz {

	//��ѯ������Ϣ��
	List<ContactUs> getAllContactUsInfo();
	//��ѯ����������
	Integer getAllContactUsCount();
	//��ID��ѯ������Ϣ��
	String getContactUsById(Integer id);
	//������Ϣ��
	Result addContactUs(ContactUs record);
	//ɾ����Ϣ��
	Result delContactUs(String id);
	//�޸���Ϣ��
	Result updateContactUs(ContactUs record);
	//��ҳ��ѯ��
	EasyUIDataGridResult getContactUsInfo(Integer page, Integer rows);
	//ģ����ҳ��ѯ��
	EasyUIDataGridResult likeContactUsInfo(Integer page, Integer rows, Integer check, String value);
}
