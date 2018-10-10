package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Partner;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IPartnerBiz {
	
	//��ѯ������Ϣ��
	List<Partner> getAllPartnerInfo();
	//��ѯ����������
	Integer getAllPartnerCount();
	//��ID��ѯ������Ϣ��
	String getPartnerById(Long id);
	//������Ϣ��
	Result addPartner(Partner record);
	//ɾ����Ϣ��
	Result delPartner(String id);
	//�޸���Ϣ��
	Result updatePartner(Partner record);
	//ģ����ѯ���з�ҳ��
	EasyUIDataGridResult likePartnerInfo(Integer page, Integer rows, String value, String indString);
	//ģ����ѯ���С�
	List<Partner> likePartnerAllInfo(String value);
}
