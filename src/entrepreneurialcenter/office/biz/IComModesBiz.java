package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComModes;
import entrepreneurialcenter.office.util.Result;

public interface IComModesBiz {
	
	//��ѯ������Ϣ��
	List<ComModes> getAllComModesInfo();
	//��ѯ����������
	Integer getAllComModesCount();
	//��ID��ѯ������Ϣ��
	String getComModesById(Long id);
	//������Ϣ��
	Result addComModes(ComModes record);
	//ɾ����Ϣ��
	Result delComModes(String id);
	//�޸���Ϣ��
	Result updateComModes(ComModes record);
	
}
