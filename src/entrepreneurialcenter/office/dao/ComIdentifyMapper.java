package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ComIdentify;
import entrepreneurialcenter.office.pojo.ComIdentifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComIdentifyMapper {
    int countByExample(ComIdentifyExample example);

    int deleteByExample(ComIdentifyExample example);

    int deleteByPrimaryKey(Long ideId);

    int insert(ComIdentify record);

    int insertSelective(ComIdentify record);

    List<ComIdentify> selectByExample(ComIdentifyExample example);

    ComIdentify selectByPrimaryKey(Long ideId);

    int updateByExampleSelective(@Param("record") ComIdentify record, @Param("example") ComIdentifyExample example);

    int updateByExample(@Param("record") ComIdentify record, @Param("example") ComIdentifyExample example);

    int updateByPrimaryKeySelective(ComIdentify record);

    int updateByPrimaryKey(ComIdentify record);
}