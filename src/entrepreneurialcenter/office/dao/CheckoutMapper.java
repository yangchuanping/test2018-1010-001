package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.Checkout;
import entrepreneurialcenter.office.pojo.CheckoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckoutMapper {
    int countByExample(CheckoutExample example);

    int deleteByExample(CheckoutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkout record);

    int insertSelective(Checkout record);

    List<Checkout> selectByExampleWithBLOBs(CheckoutExample example);

    List<Checkout> selectByExample(CheckoutExample example);

    Checkout selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByExampleWithBLOBs(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByExample(@Param("record") Checkout record, @Param("example") CheckoutExample example);

    int updateByPrimaryKeySelective(Checkout record);

    int updateByPrimaryKeyWithBLOBs(Checkout record);

    int updateByPrimaryKey(Checkout record);
}