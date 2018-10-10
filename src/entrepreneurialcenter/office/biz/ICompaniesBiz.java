package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Companies;
import entrepreneurialcenter.office.pojo.impl.CompaniesInfo;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface ICompaniesBiz {
	
	//��ѯ������Ϣ��
	List<CompaniesInfo> getAllCompaniesInfo();
	//��ѯ����������
	Integer getAllCompaniesCount();
	//��ID��ѯ������Ϣ��
	String getCompaniesById(Long id);
	//������Ϣ��
	Result addCompanies(Companies record);
	//ɾ����Ϣ��
	Result delCompanies(String id);
	//�޸���Ϣ��
	Result updateCompanies(Companies record);
	//��ҳ��ѯ
	EasyUIDataGridResult getCompaniesInfo(Integer page, Integer rows);
	//�����ѯ
	List<CompaniesInfo> RandSelectCompanies(Integer rows);
	//ģ����ѯ
	List<CompaniesInfo> likeSelectCompanies(String value);
}
