package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ComModes;
import entrepreneurialcenter.office.pojo.ComModesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComModesMapper {
    int countByExample(ComModesExample example);

    int deleteByExample(ComModesExample example);

    int deleteByPrimaryKey(Long modeId);

    int insert(ComModes record);

    int insertSelective(ComModes record);

    List<ComModes> selectByExample(ComModesExample example);

    ComModes selectByPrimaryKey(Long modeId);

    int updateByExampleSelective(@Param("record") ComModes record, @Param("example") ComModesExample example);

    int updateByExample(@Param("record") ComModes record, @Param("example") ComModesExample example);

    int updateByPrimaryKeySelective(ComModes record);

    int updateByPrimaryKey(ComModes record);
}