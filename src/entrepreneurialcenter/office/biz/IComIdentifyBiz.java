package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComIdentify;
import entrepreneurialcenter.office.util.Result;

public interface IComIdentifyBiz {
	
	//��ѯ������Ϣ��
	List<ComIdentify> getAllComIdentifyInfo();
	//��ѯ����������
	Integer getAllComIdentifyCount();
	//��ID��ѯ������Ϣ��
	String getComIdentifyById(Long id);
	//������Ϣ��
	Result addComIdentify(ComIdentify record);
	//ɾ����Ϣ��
	Result delComIdentify(String id);
	//�޸���Ϣ��
	Result updateComIdentify(ComIdentify record);
	
}
