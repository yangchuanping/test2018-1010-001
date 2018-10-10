package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Articles;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IArticlesBiz {
	
	//��ѯ������Ϣ��
	List<Articles> getAllArticles();
	//��ѯ����������
	Integer getAllArticlesCount();
	//��ID��ѯ������Ϣ��
	String getArticlesById(Long id);
	//������Ϣ��
	Result addArticles(Articles record);
	//ɾ����Ϣ��
	Result delArticles(String id);
	//�޸���Ϣ��
	Result updateArticles(Articles record);
	//��ID�����ѯ�ռ��䡣
	EasyUIDataGridResult getReceiveInfoById(Integer page, Integer rows, Long id);
	//��Id�����ѯ�����䡣
	EasyUIDataGridResult getSendInfoById(Integer page, Integer rows, Long id);
	
}
