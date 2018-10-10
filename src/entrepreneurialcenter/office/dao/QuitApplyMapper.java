package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.QuitApply;
import entrepreneurialcenter.office.pojo.QuitApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuitApplyMapper {
    int countByExample(QuitApplyExample example);

    int deleteByExample(QuitApplyExample example);

    int deleteByPrimaryKey(Integer quitId);

    int insert(QuitApply record);

    int insertSelective(QuitApply record);

    List<QuitApply> selectByExample(QuitApplyExample example);

    QuitApply selectByPrimaryKey(Integer quitId);

    int updateByExampleSelective(@Param("record") QuitApply record, @Param("example") QuitApplyExample example);

    int updateByExample(@Param("record") QuitApply record, @Param("example") QuitApplyExample example);

    int updateByPrimaryKeySelective(QuitApply record);

    int updateByPrimaryKey(QuitApply record);
}