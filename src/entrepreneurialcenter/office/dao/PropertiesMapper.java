package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.Properties;
import entrepreneurialcenter.office.pojo.PropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertiesMapper {
    int countByExample(PropertiesExample example);

    int deleteByExample(PropertiesExample example);

    int deleteByPrimaryKey(Long proId);

    int insert(Properties record);

    int insertSelective(Properties record);

    List<Properties> selectByExampleWithBLOBs(PropertiesExample example);

    List<Properties> selectByExample(PropertiesExample example);

    Properties selectByPrimaryKey(Long proId);

    int updateByExampleSelective(@Param("record") Properties record, @Param("example") PropertiesExample example);

    int updateByExampleWithBLOBs(@Param("record") Properties record, @Param("example") PropertiesExample example);

    int updateByExample(@Param("record") Properties record, @Param("example") PropertiesExample example);

    int updateByPrimaryKeySelective(Properties record);

    int updateByPrimaryKeyWithBLOBs(Properties record);

    int updateByPrimaryKey(Properties record);
}