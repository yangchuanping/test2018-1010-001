package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Checkout;
import entrepreneurialcenter.office.util.Result;

public interface ICheckoutBiz {
	
	//��ѯ������Ϣ��
	List<Checkout> getAllCheckoutInfo();
	//��ѯ����������
	Integer getAllCheckoutCount();
	//��ID��ѯ������Ϣ��
	String getCheckoutById(Integer id);
	//������Ϣ��
	Result addCheckout(Checkout record);
	//ɾ����Ϣ��
	Result delCheckout(String id);
	//�޸���Ϣ��
	Result updateCheckout(Checkout record);
	
}
