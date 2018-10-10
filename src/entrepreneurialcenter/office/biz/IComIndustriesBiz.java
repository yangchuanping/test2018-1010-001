package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComIndustries;
import entrepreneurialcenter.office.util.Result;

public interface IComIndustriesBiz {
	
	//��ѯ������Ϣ��
	List<ComIndustries> getAllComIndustriesInfo();
	//��ѯ����������
	Integer getAllComIndustriesCount();
	//��ID��ѯ������Ϣ��
	String getComIndustriesById(Long id);
	//������Ϣ��
	Result addComIndustries(ComIndustries record);
	//ɾ����Ϣ��
	Result delComIndustries(String id);
	//�޸���Ϣ��
	Result updateComIndustries(ComIndustries record);
	
}
