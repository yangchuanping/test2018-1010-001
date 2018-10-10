package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.MaintainApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IMaintainApplyBiz {

	//��ѯ������Ϣ��
	List<MaintainApply> getAllMaintainApplyInfo();
	//��ѯ����������
	Integer getAllMaintainApplyCount();
	//��ID��ѯ������Ϣ��
	String getMaintainApplyById(Integer id);
	//������Ϣ��
	Result addMaintainApply(MaintainApply record);
	//ɾ����Ϣ��
	Result delMaintainApply(String id);
	//�޸���Ϣ��
	Result updateMaintainApply(MaintainApply record);
	//��ҳ��ѯ��
	EasyUIDataGridResult getMaintainApplyInfo(Integer page, Integer rows);
	//��ҳģ����ѯ��
	EasyUIDataGridResult likeMaintainApplyInfo(Integer page, Integer rows, String value, String address, Integer check);
}
