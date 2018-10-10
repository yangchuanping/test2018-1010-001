package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.Companies;
import entrepreneurialcenter.office.pojo.CompaniesExample;
import entrepreneurialcenter.office.pojo.impl.CompaniesInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompaniesMapper {
    int countByExample(CompaniesExample example);

    int deleteByExample(CompaniesExample example);

    int deleteByPrimaryKey(Long comId);

    int insert(Companies record);

    int insertSelective(Companies record);

    List<Companies> selectByExample(CompaniesExample example);
    
    List<CompaniesInfo> selectCompaniesInfo();
    
    List<CompaniesInfo> RandSelectCompanies(@Param("rows")Integer rows);
    
    List<CompaniesInfo> likeSelectCompanies(@Param("value")String value);

    Companies selectByPrimaryKey(Long comId);

    int updateByExampleSelective(@Param("record") Companies record, @Param("example") CompaniesExample example);

    int updateByExample(@Param("record") Companies record, @Param("example") CompaniesExample example);

    int updateByPrimaryKeySelective(Companies record);

    int updateByPrimaryKey(Companies record);
}