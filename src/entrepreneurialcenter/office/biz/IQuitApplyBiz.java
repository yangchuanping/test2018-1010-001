package entrepreneurialcenter.office.biz;

import java.util.Date;
import java.util.List;

import entrepreneurialcenter.office.pojo.QuitApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IQuitApplyBiz {

	//��ѯ������Ϣ��
	List<QuitApply> getAllQuitApplyInfo();
	//��ѯ����������
	Integer getAllQuitApplyCount();
	//��ID��ѯ������Ϣ��
	String getQuitApplyById(Integer id);
	//������Ϣ��
	Result addQuitApply(QuitApply record);
	//ɾ����Ϣ��
	Result delQuitApply(String id);
	//�޸���Ϣ��
	Result updateQuitApply(QuitApply record);
	//��ҳ��ѯ��
	EasyUIDataGridResult getQuitApplyInfo(Integer page, Integer rows);
	//��ҳģ����ѯ��
	EasyUIDataGridResult likeQuitApplyInfo(Integer page, Integer rows, String quitCompany, Integer quitCheck, Date startTime, Date endTime);
}
