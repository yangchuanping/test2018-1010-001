package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ProLeaseholds;
import entrepreneurialcenter.office.util.Result;

public interface IProLeaseholdsBiz {
	
	//��ѯ������Ϣ��
	List<ProLeaseholds> getAllProLeaseholdsInfo();
	//��ѯ����������
	Integer getAllProLeaseholdsCount();
	//��ID��ѯ������Ϣ��
	String getProLeaseholdsById(Long id);
	//������Ϣ��
	Result addProLeaseholds(ProLeaseholds record);
	//ɾ����Ϣ��
	Result delProLeaseholds(String id);
	//�޸���Ϣ��
	Result updateProLeaseholds(ProLeaseholds record);
	
}
