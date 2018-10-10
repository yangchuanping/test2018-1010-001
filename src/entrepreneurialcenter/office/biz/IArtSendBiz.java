package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ArtSend;
import entrepreneurialcenter.office.util.Result;

public interface IArtSendBiz {
	
	//��ѯ������Ϣ��
	List<ArtSend> getAllArtSendInfo();
	//��ѯ����������
	Integer getAllArtSendCount();
	//��ID��ѯ������Ϣ��
	String getArtSendById(Long id);
	//������Ϣ��
	Result addArtSend(ArtSend record);
	//ɾ����Ϣ��
	Result delArtSend(String id);
	//�޸���Ϣ��
	Result updateArtSend(ArtSend record);
	
}
