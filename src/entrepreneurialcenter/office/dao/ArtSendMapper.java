package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ArtSend;
import entrepreneurialcenter.office.pojo.ArtSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtSendMapper {
    int countByExample(ArtSendExample example);

    int deleteByExample(ArtSendExample example);

    int deleteByPrimaryKey(Long sendId);

    int insert(ArtSend record);

    int insertSelective(ArtSend record);

    List<ArtSend> selectByExample(ArtSendExample example);

    ArtSend selectByPrimaryKey(Long sendId);

    int updateByExampleSelective(@Param("record") ArtSend record, @Param("example") ArtSendExample example);

    int updateByExample(@Param("record") ArtSend record, @Param("example") ArtSendExample example);

    int updateByPrimaryKeySelective(ArtSend record);

    int updateByPrimaryKey(ArtSend record);
}