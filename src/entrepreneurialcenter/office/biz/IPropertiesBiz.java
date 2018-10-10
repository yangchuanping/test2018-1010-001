package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Properties;
import entrepreneurialcenter.office.util.Result;

public interface IPropertiesBiz {
	
	//��ѯ������Ϣ��
	List<Properties> getAllPropertiesInfo();
	//��ѯ����������
	Integer getAllPropertiesCount();
	//��ID��ѯ������Ϣ��
	String getPropertiesById(Long id);
	//������Ϣ��
	Result addProperties(Properties record);
	//ɾ����Ϣ��
	Result delProperties(String id);
	//�޸���Ϣ��
	Result updateProperties(Properties record);
	
}
