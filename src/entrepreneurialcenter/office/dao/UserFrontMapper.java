package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.UserFront;
import entrepreneurialcenter.office.pojo.UserFrontExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFrontMapper {
    int countByExample(UserFrontExample example);

    int deleteByExample(UserFrontExample example);

    int deleteByPrimaryKey(Long frontId);

    int insert(UserFront record);

    int insertSelective(UserFront record);

    List<UserFront> selectByExample(UserFrontExample example);

    UserFront selectByPrimaryKey(Long frontId);

    int updateByExampleSelective(@Param("record") UserFront record, @Param("example") UserFrontExample example);

    int updateByExample(@Param("record") UserFront record, @Param("example") UserFrontExample example);

    int updateByPrimaryKeySelective(UserFront record);

    int updateByPrimaryKey(UserFront record);
}