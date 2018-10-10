package entrepreneurialcenter.office.biz;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entrepreneurialcenter.office.pojo.User;
import entrepreneurialcenter.office.pojo.impl.UserGpDep;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IUserBiz {
	
	//��ѯ������Ϣ��
	List<User> getAllUserInfo();
	//��ѯ����������
	Integer getAllUserCount();
	//��ID��ѯ������Ϣ��
	String getUserById(Long id);
	//������Ϣ��
	Result addUser(User record);
	//ɾ����Ϣ��
	Result delUser(String id);
	//�޸���Ϣ��
	Result updateUser(User record);
	//��������
	Result updateUserPass(Long id);
	//�û�����¼��
	Result loginUser(String username, String password, HttpServletRequest request,HttpServletResponse response);
	//��ҳ�����ѯ��
	EasyUIDataGridResult getUserInfo(Integer page, Integer rows);
	//�����ѯ�����û���Ϣ��
	List<UserGpDep> getAllUserGpDepInfo();
}
