package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.Articles;
import entrepreneurialcenter.office.pojo.ArticlesExample;
import entrepreneurialcenter.office.pojo.impl.ReceiveInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(Long artId);

    int insert(Articles record);

    int insertSelective(Articles record);

    List<Articles> selectByExample(ArticlesExample example);

    Articles selectByPrimaryKey(Long artId);

    int updateByExampleSelective(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKey(Articles record);
    
    List<ReceiveInfo> getReceiveInfoById(@Param("id")Long id);
    
    List<ReceiveInfo> getSendInfoById(@Param("id")Long id);
}