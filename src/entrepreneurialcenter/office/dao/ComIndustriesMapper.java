package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ComIndustries;
import entrepreneurialcenter.office.pojo.ComIndustriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComIndustriesMapper {
    int countByExample(ComIndustriesExample example);

    int deleteByExample(ComIndustriesExample example);

    int deleteByPrimaryKey(Long indId);

    int insert(ComIndustries record);

    int insertSelective(ComIndustries record);

    List<ComIndustries> selectByExample(ComIndustriesExample example);

    ComIndustries selectByPrimaryKey(Long indId);

    int updateByExampleSelective(@Param("record") ComIndustries record, @Param("example") ComIndustriesExample example);

    int updateByExample(@Param("record") ComIndustries record, @Param("example") ComIndustriesExample example);

    int updateByPrimaryKeySelective(ComIndustries record);

    int updateByPrimaryKey(ComIndustries record);
}