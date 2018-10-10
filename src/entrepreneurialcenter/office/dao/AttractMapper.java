package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.Attract;
import entrepreneurialcenter.office.pojo.AttractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttractMapper {
    int countByExample(AttractExample example);

    int deleteByExample(AttractExample example);

    int deleteByPrimaryKey(Integer attractId);

    int insert(Attract record);

    int insertSelective(Attract record);

    List<Attract> selectByExample(AttractExample example);

    Attract selectByPrimaryKey(Integer attractId);

    int updateByExampleSelective(@Param("record") Attract record, @Param("example") AttractExample example);

    int updateByExample(@Param("record") Attract record, @Param("example") AttractExample example);

    int updateByPrimaryKeySelective(Attract record);

    int updateByPrimaryKey(Attract record);
}