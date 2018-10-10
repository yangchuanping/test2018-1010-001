package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComTypes;
import entrepreneurialcenter.office.util.Result;

public interface IComTypesBiz {
	
	//��ѯ������Ϣ��
	List<ComTypes> getAllComTypesInfo();
	//��ѯ����������
	Integer getAllComTypesCount();
	//��ID��ѯ������Ϣ��
	String getComTypesById(Long id);
	//������Ϣ��
	Result addComTypes(ComTypes record);
	//ɾ����Ϣ��
	Result delComTypes(String id);
	//�޸���Ϣ��
	Result updateComTypes(ComTypes record);
	
}
