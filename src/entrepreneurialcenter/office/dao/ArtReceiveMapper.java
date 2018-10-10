package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ArtReceive;
import entrepreneurialcenter.office.pojo.ArtReceiveExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtReceiveMapper {
    int countByExample(ArtReceiveExample example);

    int deleteByExample(ArtReceiveExample example);

    int deleteByPrimaryKey(Long receiveId);

    int insert(ArtReceive record);

    int insertSelective(ArtReceive record);

    List<ArtReceive> selectByExample(ArtReceiveExample example);

    ArtReceive selectByPrimaryKey(Long receiveId);

    int updateByExampleSelective(@Param("record") ArtReceive record, @Param("example") ArtReceiveExample example);

    int updateByExample(@Param("record") ArtReceive record, @Param("example") ArtReceiveExample example);

    int updateByPrimaryKeySelective(ArtReceive record);

    int updateByPrimaryKey(ArtReceive record);
}