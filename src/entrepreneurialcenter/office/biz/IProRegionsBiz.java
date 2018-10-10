package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ProRegions;
import entrepreneurialcenter.office.util.Result;

public interface IProRegionsBiz {
	
	//��ѯ������Ϣ��
	List<ProRegions> getAllProRegionsInfo();
	//��ѯ����ʾ����Ϣ��
	List<ProRegions> getProRegionsInfoByStatus();
	//��ѯ����������
	Integer getAllProRegionsCount();
	//��ID��ѯ������Ϣ��
	String getProRegionsById(Long id);
	//������Ϣ��
	Result addProRegions(ProRegions record);
	//ɾ����Ϣ��
	Result delProRegions(String id);
	//�޸���Ϣ��
	Result updateProRegions(ProRegions record);
	
}
