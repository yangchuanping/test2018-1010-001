package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComProjects;
import entrepreneurialcenter.office.util.Result;

public interface IComProjectsBiz {
	
	//��ѯ������Ϣ��
	List<ComProjects> getAllComProjectsInfo();
	//��ѯ����������
	Integer getAllComProjectsCount();
	//��ID��ѯ������Ϣ��
	String getComProjectsById(Long id);
	//������Ϣ��
	Result addComProjects(ComProjects record);
	//ɾ����Ϣ��
	Result delComProjects(String id);
	//�޸���Ϣ��
	Result updateComProjects(ComProjects record);
	
}
