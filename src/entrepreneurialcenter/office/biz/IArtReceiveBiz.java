package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ArtReceive;
import entrepreneurialcenter.office.util.Result;

public interface IArtReceiveBiz {
	
	//��ѯ������Ϣ��
	List<ArtReceive> getAllArtReceiveInfo();
	//��ѯ����������
	Integer getAllArtReceiveCount();
	//��ID��ѯ������Ϣ��
	String getArtReceiveById(Long id);
	//������Ϣ��
	Result addArtReceive(ArtReceive record);
	//ɾ����Ϣ��
	Result delArtReceive(String id);
	//�޸���Ϣ��
	Result updateArtReceive(ArtReceive record);
}
