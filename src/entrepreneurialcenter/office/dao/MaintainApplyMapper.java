package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.MaintainApply;
import entrepreneurialcenter.office.pojo.MaintainApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainApplyMapper {
    int countByExample(MaintainApplyExample example);

    int deleteByExample(MaintainApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaintainApply record);

    int insertSelective(MaintainApply record);

    List<MaintainApply> selectByExample(MaintainApplyExample example);

    MaintainApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaintainApply record, @Param("example") MaintainApplyExample example);

    int updateByExample(@Param("record") MaintainApply record, @Param("example") MaintainApplyExample example);

    int updateByPrimaryKeySelective(MaintainApply record);

    int updateByPrimaryKey(MaintainApply record);
}