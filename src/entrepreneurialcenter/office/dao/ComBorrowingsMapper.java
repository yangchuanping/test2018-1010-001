package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ComBorrowings;
import entrepreneurialcenter.office.pojo.ComBorrowingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComBorrowingsMapper {
    int countByExample(ComBorrowingsExample example);

    int deleteByExample(ComBorrowingsExample example);

    int deleteByPrimaryKey(Long borrowId);

    int insert(ComBorrowings record);

    int insertSelective(ComBorrowings record);

    List<ComBorrowings> selectByExample(ComBorrowingsExample example);

    ComBorrowings selectByPrimaryKey(Long borrowId);

    int updateByExampleSelective(@Param("record") ComBorrowings record, @Param("example") ComBorrowingsExample example);

    int updateByExample(@Param("record") ComBorrowings record, @Param("example") ComBorrowingsExample example);

    int updateByPrimaryKeySelective(ComBorrowings record);

    int updateByPrimaryKey(ComBorrowings record);
}