package entrepreneurialcenter.office.biz;

import java.util.Date;
import java.util.List;

import entrepreneurialcenter.office.pojo.SiteChanges;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface ISiteChangesBiz {

	//��ѯ������Ϣ��
	List<SiteChanges> getAllSiteChangesInfo();
	//��ѯ����������
	Integer getAllSiteChangesCount();
	//��ID��ѯ������Ϣ��
	String getSiteChangesById(Integer id);
	//������Ϣ��
	Result addSiteChanges(SiteChanges record);
	//ɾ����Ϣ��
	Result delSiteChanges(String id);
	//�޸���Ϣ��
	Result updateSiteChanges(SiteChanges record);
	//��ҳ��ѯ��
	EasyUIDataGridResult getSiteChangesInfo(Integer page, Integer rows);
	//��ҳģ����ѯ��
	EasyUIDataGridResult likeSiteChangesInfo(Integer page, Integer rows, String siteCompany, Integer siteCheck, Date startTime, Date endTime);
}
