package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.UserGroup;
import entrepreneurialcenter.office.util.Result;

public interface IUserGroupBiz {
	
	//��ѯ������Ϣ��
	List<UserGroup> getAllUserGroupInfo();
	//��ѯ����������
	Integer getAllUserGroupCount();
	//��ID��ѯ������Ϣ��
	String getUserGroupById(Long id);
	//������Ϣ��
	Result addUserGroup(UserGroup record);
	//ɾ����Ϣ��
	Result delUserGroup(String id);
	//�޸���Ϣ��
	Result updateUserGroup(UserGroup record);
	
}
