package entrepreneurialcenter.office.biz;

import java.util.Date;
import java.util.List;

import entrepreneurialcenter.office.pojo.SiteChanges;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

public interface ISiteChangesBiz {

	//查询所有信息。
	List<SiteChanges> getAllSiteChangesInfo();
	//查询所有条数。
	Integer getAllSiteChangesCount();
	//按ID查询单条信息。
	String getSiteChangesById(Integer id);
	//新增信息。
	Result addSiteChanges(SiteChanges record);
	//删除信息。
	Result delSiteChanges(String id);
	//修改信息。
	Result updateSiteChanges(SiteChanges record);
	//分页查询。
	EasyUIDataGridResult getSiteChangesInfo(Integer page, Integer rows);
	//分页模糊查询。
	EasyUIDataGridResult likeSiteChangesInfo(Integer page, Integer rows, String siteCompany, Integer siteCheck, Date startTime, Date endTime);
}
