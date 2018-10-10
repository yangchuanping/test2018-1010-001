package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.SiteChanges;
import entrepreneurialcenter.office.pojo.SiteChangesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteChangesMapper {
    int countByExample(SiteChangesExample example);

    int deleteByExample(SiteChangesExample example);

    int deleteByPrimaryKey(Integer siteId);

    int insert(SiteChanges record);

    int insertSelective(SiteChanges record);

    List<SiteChanges> selectByExample(SiteChangesExample example);

    SiteChanges selectByPrimaryKey(Integer siteId);

    int updateByExampleSelective(@Param("record") SiteChanges record, @Param("example") SiteChangesExample example);

    int updateByExample(@Param("record") SiteChanges record, @Param("example") SiteChangesExample example);

    int updateByPrimaryKeySelective(SiteChanges record);

    int updateByPrimaryKey(SiteChanges record);
}