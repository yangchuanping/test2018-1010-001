package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Message;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IMessageBiz {
	
	//��ѯ������Ϣ��
	List<Message> getAllMessageInfo();
	//��ѯ����������
	Integer getAllMessageCount();
	//��ID��ѯ������Ϣ��
	String getMessageById(Long id);
	//������Ϣ��
	Result addMessage(Message record);
	//ɾ����Ϣ��
	Result delMessage(String id);
	//�޸���Ϣ��
	Result updateMessage(Message record);
	//��ҳ��ѯ��
	EasyUIDataGridResult getMessageInfo(Integer page, Integer rows);
	//��ҳ��ѯ����Ѷ���͡�
	EasyUIDataGridResult getMessageInfoByType(Integer page, Integer rows, Integer type);
	//��ҳģ����ѯ���С�
	EasyUIDataGridResult likeMessageInfo(Integer page, Integer rows, String value, Integer type);
}
