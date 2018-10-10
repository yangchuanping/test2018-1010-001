package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Attract;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IAttractBiz {

	//��ѯ������Ϣ��
	List<Attract> getAllAttractInfo();
	//��ѯ����������
	Integer getAllAttractCount();
	//��ID��ѯ������Ϣ��
	String getAttractById(Integer id);
	//������Ϣ��
	Result addAttract(Attract record);
	//ɾ����Ϣ��
	Result delAttract(String id);
	//�޸���Ϣ��
	Result updateAttract(Attract record);
	//��ҳģ����ѯ��
	EasyUIDataGridResult likeAttractInfo(Integer page, Integer rows, String value, String garden, String area);
	//��ҳģ����ѯ��
	EasyUIDataGridResult likeAttractInfoBackPage(Integer page, Integer rows, String garden, String area, String status);
}
