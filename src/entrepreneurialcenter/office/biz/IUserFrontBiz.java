package entrepreneurialcenter.office.biz;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entrepreneurialcenter.office.pojo.UserFront;
import entrepreneurialcenter.office.util.Result;

public interface IUserFrontBiz {

	//��ѯ������Ϣ��
	List<UserFront> getAllUserFrontInfo();
	//��ѯ����������
	Integer getAllUserFrontCount();
	//��ID��ѯ������Ϣ��
	String getUserFrontById(Long id);
	//������Ϣ��
	Result addUserFront(UserFront record);
	//ɾ����Ϣ��
	Result delUserFront(String id);
	//�޸���Ϣ��
	Result updateUserFront(UserFront record);
	//�޸����롣
	Result updateUserFrontPass(Long id, String oldPass, String newPass);
	//����ֻ������Ƿ��ظ�
	Result getPhoneIsRepet(String value);
	//�û�����¼��
	Result loginUserFront(String username, String password, HttpServletRequest request,HttpServletResponse response);
}
