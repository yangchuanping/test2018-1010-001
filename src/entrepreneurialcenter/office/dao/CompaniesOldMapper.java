package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.CompaniesOld;
import entrepreneurialcenter.office.pojo.CompaniesOldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompaniesOldMapper {
    int countByExample(CompaniesOldExample example);

    int deleteByExample(CompaniesOldExample example);

    int deleteByPrimaryKey(Long comId);

    int insert(CompaniesOld record);

    int insertSelective(CompaniesOld record);

    List<CompaniesOld> selectByExample(CompaniesOldExample example);

    CompaniesOld selectByPrimaryKey(Long comId);

    int updateByExampleSelective(@Param("record") CompaniesOld record, @Param("example") CompaniesOldExample example);

    int updateByExample(@Param("record") CompaniesOld record, @Param("example") CompaniesOldExample example);

    int updateByPrimaryKeySelective(CompaniesOld record);

    int updateByPrimaryKey(CompaniesOld record);
}