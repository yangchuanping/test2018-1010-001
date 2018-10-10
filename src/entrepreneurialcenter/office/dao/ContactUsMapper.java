package entrepreneurialcenter.office.dao;

import entrepreneurialcenter.office.pojo.ContactUs;
import entrepreneurialcenter.office.pojo.ContactUsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactUsMapper {
    int countByExample(ContactUsExample example);

    int deleteByExample(ContactUsExample example);

    int deleteByPrimaryKey(Integer contactId);

    int insert(ContactUs record);

    int insertSelective(ContactUs record);

    List<ContactUs> selectByExample(ContactUsExample example);

    ContactUs selectByPrimaryKey(Integer contactId);

    int updateByExampleSelective(@Param("record") ContactUs record, @Param("example") ContactUsExample example);

    int updateByExample(@Param("record") ContactUs record, @Param("example") ContactUsExample example);

    int updateByPrimaryKeySelective(ContactUs record);

    int updateByPrimaryKey(ContactUs record);
}