package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ProBuildings;
import entrepreneurialcenter.office.pojo.impl.ProBuiReg;
import entrepreneurialcenter.office.util.Result;

public interface IProBuildingsBiz {
	
	//��ѯ������Ϣ��
	List<ProBuildings> getAllProBuildingsInfo();
	//��ѯ����������
	Integer getAllProBuildingsCount();
	//��ID��ѯ������Ϣ��
	String getProBuildingsById(Long id);
	//������Ϣ��
	Result addProBuildings(ProBuildings record);
	//ɾ����Ϣ��
	Result delProBuildings(String id);
	//�޸���Ϣ��
	Result updateProBuildings(ProBuildings record);
	//�����ѯ
	List<ProBuiReg> getProBuiReg();
	//��԰��id��ȫ��¥��
	List<ProBuildings> getBuiByReg(Long id);
}
