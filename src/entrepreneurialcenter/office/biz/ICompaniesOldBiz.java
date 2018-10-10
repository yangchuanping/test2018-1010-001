package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.CompaniesOld;
import entrepreneurialcenter.office.util.Result;

public interface ICompaniesOldBiz {
	
	//��ѯ������Ϣ��
	List<CompaniesOld> getAllCompaniesOldInfo();
	//��ѯ����������
	Integer getAllCompaniesOldCount();
	//��ID��ѯ������Ϣ��
	String getCompaniesOldById(Long id);
	//������Ϣ��
	Result addCompaniesOld(CompaniesOld record);
	//ɾ����Ϣ��
	Result delCompaniesOld(String id);
	//�޸���Ϣ��
	Result updateCompaniesOld(CompaniesOld record);
	
}
