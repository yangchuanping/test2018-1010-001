package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ProRegions;
import entrepreneurialcenter.office.pojo.ProRegionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProRegionsMapper {
    int countByExample(ProRegionsExample example);

    int deleteByExample(ProRegionsExample example);

    int deleteByPrimaryKey(Long regionId);

    int insert(ProRegions record);

    int insertSelective(ProRegions record);

    List<ProRegions> selectByExample(ProRegionsExample example);

    ProRegions selectByPrimaryKey(Long regionId);

    int updateByExampleSelective(@Param("record") ProRegions record, @Param("example") ProRegionsExample example);

    int updateByExample(@Param("record") ProRegions record, @Param("example") ProRegionsExample example);

    int updateByPrimaryKeySelective(ProRegions record);

    int updateByPrimaryKey(ProRegions record);
}