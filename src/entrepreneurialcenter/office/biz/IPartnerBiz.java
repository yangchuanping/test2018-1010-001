package entrepreneurialcenter.office.biz;

import java.util.List;

import entrepreneurialcenter.office.pojo.Partner;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface IPartnerBiz {
	
	//查询所有信息。
	List<Partner> getAllPartnerInfo();
	//查询所有条数。
	Integer getAllPartnerCount();
	//按ID查询单条信息。
	String getPartnerById(Long id);
	//新增信息。
	Result addPartner(Partner record);
	//删除信息。
	Result delPartner(String id);
	//修改信息。
	Result updatePartner(Partner record);
	//模糊查询所有分页。
	EasyUIDataGridResult likePartnerInfo(Integer page, Integer rows, String value, String indString);
	//模糊查询所有。
	List<Partner> likePartnerAllInfo(String value);
}
