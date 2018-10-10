package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.GardenApply;
import entrepreneurialcenter.office.pojo.GardenApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GardenApplyMapper {
    int countByExample(GardenApplyExample example);

    int deleteByExample(GardenApplyExample example);

    int deleteByPrimaryKey(Integer gardenId);

    int insert(GardenApply record);

    int insertSelective(GardenApply record);

    List<GardenApply> selectByExample(GardenApplyExample example);

    GardenApply selectByPrimaryKey(Integer gardenId);

    int updateByExampleSelective(@Param("record") GardenApply record, @Param("example") GardenApplyExample example);

    int updateByExample(@Param("record") GardenApply record, @Param("example") GardenApplyExample example);

    int updateByPrimaryKeySelective(GardenApply record);

    int updateByPrimaryKey(GardenApply record);
}