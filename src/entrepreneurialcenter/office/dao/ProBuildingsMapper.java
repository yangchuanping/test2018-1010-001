package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ProBuildings;
import entrepreneurialcenter.office.pojo.ProBuildingsExample;
import entrepreneurialcenter.office.pojo.impl.ProBuiReg;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProBuildingsMapper {
    int countByExample(ProBuildingsExample example);

    int deleteByExample(ProBuildingsExample example);

    int deleteByPrimaryKey(Long buildingId);

    int insert(ProBuildings record);

    int insertSelective(ProBuildings record);

    List<ProBuildings> selectByExample(ProBuildingsExample example);
    
    List<ProBuiReg> selectProBuiReg();

    ProBuildings selectByPrimaryKey(Long buildingId);

    int updateByExampleSelective(@Param("record") ProBuildings record, @Param("example") ProBuildingsExample example);

    int updateByExample(@Param("record") ProBuildings record, @Param("example") ProBuildingsExample example);

    int updateByPrimaryKeySelective(ProBuildings record);

    int updateByPrimaryKey(ProBuildings record);
}