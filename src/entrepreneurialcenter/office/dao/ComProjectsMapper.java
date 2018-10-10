package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ComProjects;
import entrepreneurialcenter.office.pojo.ComProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComProjectsMapper {
    int countByExample(ComProjectsExample example);

    int deleteByExample(ComProjectsExample example);

    int deleteByPrimaryKey(Long projectId);

    int insert(ComProjects record);

    int insertSelective(ComProjects record);

    List<ComProjects> selectByExample(ComProjectsExample example);

    ComProjects selectByPrimaryKey(Long projectId);

    int updateByExampleSelective(@Param("record") ComProjects record, @Param("example") ComProjectsExample example);

    int updateByExample(@Param("record") ComProjects record, @Param("example") ComProjectsExample example);

    int updateByPrimaryKeySelective(ComProjects record);

    int updateByPrimaryKey(ComProjects record);
}