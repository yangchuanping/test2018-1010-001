package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.Partner;
import entrepreneurialcenter.office.pojo.PartnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerMapper {
    int countByExample(PartnerExample example);

    int deleteByExample(PartnerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Partner record);

    int insertSelective(Partner record);

    List<Partner> selectByExample(PartnerExample example);

    Partner selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Partner record, @Param("example") PartnerExample example);

    int updateByExample(@Param("record") Partner record, @Param("example") PartnerExample example);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}