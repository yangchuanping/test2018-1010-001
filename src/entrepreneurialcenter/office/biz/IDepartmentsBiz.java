package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Departments;
import entrepreneurialcenter.office.util.Result;

public interface IDepartmentsBiz {
	
	//��ѯ������Ϣ��
	List<Departments> getAllDepartmentsInfo();
	//��ѯ����������
	Integer getAllDepartmentsCount();
	//��ID��ѯ������Ϣ��
	String getDepartmentsById(Long id);
	//������Ϣ��
	Result addDepartments(Departments record);
	//ɾ����Ϣ��
	Result delDepartments(String id);
	//�޸���Ϣ��
	Result updateDepartments(Departments record);
	
}
