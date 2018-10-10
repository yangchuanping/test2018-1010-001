package entrepreneurialcenter.office.biz;

import java.util.Date;
import java.util.List;

import entrepreneurialcenter.office.pojo.GardenApply;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IGardenApplyBiz {

	//��ѯ������Ϣ��
	List<GardenApply> getAllGardenApplyInfo();
	//��ѯ����������
	Integer getAllGardenApplyCount();
	//��ID��ѯ������Ϣ��
	String getGardenApplyById(Integer id);
	//������Ϣ��
	Result addGardenApply(GardenApply record);
	//ɾ����Ϣ��
	Result delGardenApply(String id);
	//�޸���Ϣ��
	Result updateGardenApply(GardenApply record);
	//��ҳ��ѯ��
	EasyUIDataGridResult getGardenApplyInfo(Integer page, Integer rows);
	//ģ����ҳ��ѯ��
	EasyUIDataGridResult LikeGardenApplyInfo(Integer page, Integer rows, String gardenCompany, Integer gardenCheck, Date startTime, Date endTime);
	//��ǰ���û�Id��ѯ������Ϣ��
	List<GardenApply> getGardenByFrontId(Long id);
}
