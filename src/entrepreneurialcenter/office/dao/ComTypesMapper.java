package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ComTypes;
import entrepreneurialcenter.office.pojo.ComTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComTypesMapper {
    int countByExample(ComTypesExample example);

    int deleteByExample(ComTypesExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(ComTypes record);

    int insertSelective(ComTypes record);

    List<ComTypes> selectByExample(ComTypesExample example);

    ComTypes selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") ComTypes record, @Param("example") ComTypesExample example);

    int updateByExample(@Param("record") ComTypes record, @Param("example") ComTypesExample example);

    int updateByPrimaryKeySelective(ComTypes record);

    int updateByPrimaryKey(ComTypes record);
}