package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.ComBorrowings;
import entrepreneurialcenter.office.util.Result;

public interface IComBorrowingsBiz {
	
	//查询所有信息。
	List<ComBorrowings> getAllComBorrowingsInfo();
	//查询所有条数。
	Integer getAllComBorrowingsCount();
	//按ID查询单条信息。
	String getComBorrowingsById(Long id);
	//新增信息。
	Result addComBorrowings(ComBorrowings record);
	//删除信息。
	Result delComBorrowings(String id);
	//修改信息。
	Result updateComBorrowings(ComBorrowings record);
	
}
