package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ProLeaseholds;
import entrepreneurialcenter.office.pojo.ProLeaseholdsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProLeaseholdsMapper {
    int countByExample(ProLeaseholdsExample example);

    int deleteByExample(ProLeaseholdsExample example);

    int deleteByPrimaryKey(Long leaId);

    int insert(ProLeaseholds record);

    int insertSelective(ProLeaseholds record);

    List<ProLeaseholds> selectByExampleWithBLOBs(ProLeaseholdsExample example);

    List<ProLeaseholds> selectByExample(ProLeaseholdsExample example);

    ProLeaseholds selectByPrimaryKey(Long leaId);

    int updateByExampleSelective(@Param("record") ProLeaseholds record, @Param("example") ProLeaseholdsExample example);

    int updateByExampleWithBLOBs(@Param("record") ProLeaseholds record, @Param("example") ProLeaseholdsExample example);

    int updateByExample(@Param("record") ProLeaseholds record, @Param("example") ProLeaseholdsExample example);

    int updateByPrimaryKeySelective(ProLeaseholds record);

    int updateByPrimaryKeyWithBLOBs(ProLeaseholds record);

    int updateByPrimaryKey(ProLeaseholds record);
}