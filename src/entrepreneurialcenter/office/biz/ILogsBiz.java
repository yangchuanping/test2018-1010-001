package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Logs;
import entrepreneurialcenter.office.util.Result;

public interface ILogsBiz {
	
	//��ѯ������Ϣ��
	List<Logs> getAllLogsInfo();
	//��ѯ����������
	Integer getAllLogsCount();
	//��ID��ѯ������Ϣ��
	String getLogsById(Long id);
	//������Ϣ��
	Result addLogs(Logs record);
	//ɾ����Ϣ��
	Result delLogs(String id);
	//�޸���Ϣ��
	Result updateLogs(Logs record);
	
}
