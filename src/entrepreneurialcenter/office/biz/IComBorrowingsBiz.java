package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComBorrowings;
import entrepreneurialcenter.office.util.Result;

public interface IComBorrowingsBiz {
	
	//��ѯ������Ϣ��
	List<ComBorrowings> getAllComBorrowingsInfo();
	//��ѯ����������
	Integer getAllComBorrowingsCount();
	//��ID��ѯ������Ϣ��
	String getComBorrowingsById(Long id);
	//������Ϣ��
	Result addComBorrowings(ComBorrowings record);
	//ɾ����Ϣ��
	Result delComBorrowings(String id);
	//�޸���Ϣ��
	Result updateComBorrowings(ComBorrowings record);
	
}
