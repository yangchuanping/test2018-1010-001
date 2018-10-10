package entrepreneurialcenter.office.biz.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IMaintainApplyBiz;
import entrepreneurialcenter.office.dao.MaintainApplyMapper;
import entrepreneurialcenter.office.pojo.MaintainApply;
import entrepreneurialcenter.office.pojo.MaintainApplyExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class MaintainApplyBizImpl implements IMaintainApplyBiz {

	@Autowired
	private MaintainApplyMapper maintainApplyMapper; 
	
	@Override
	public List<MaintainApply> getAllMaintainApplyInfo() {
		// TODO Auto-generated method stub
		return maintainApplyMapper.selectByExample(new MaintainApplyExample());
	}

	@Override
	public Integer getAllMaintainApplyCount() {
		// TODO Auto-generated method stub
		return maintainApplyMapper.countByExample(new MaintainApplyExample());
	}

	@Override
	public String getMaintainApplyById(Integer id) {
		// TODO Auto-generated method stub
		MaintainApply maintainApply = maintainApplyMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(maintainApply);
	}

	@Override
	public Result addMaintainApply(MaintainApply record) {
		// TODO Auto-generated method stub
		record.setMaintainCheck(0);
		record.setMaintainCreate(new Date());
		if (maintainApplyMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delMaintainApply(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = maintainApplyMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateMaintainApply(MaintainApply record) {
		// TODO Auto-generated method stub
		MaintainApply maintainApply = maintainApplyMapper.selectByPrimaryKey(record.getId());
		maintainApply.setMaintainAddress(record.getMaintainAddress());
		maintainApply.setMaintainContent(record.getMaintainContent());
		maintainApply.setMaintainImg(record.getMaintainImg());
		maintainApply.setMaintainName(record.getMaintainName());
		maintainApply.setMaintainPhone(record.getMaintainPhone());
		maintainApply.setMaintainCheck(record.getMaintainCheck());
		
		if (maintainApplyMapper.updateByPrimaryKey(maintainApply) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult getMaintainApplyInfo(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);	
		
		MaintainApplyExample example = new MaintainApplyExample();
		example.setOrderByClause("maintain_create desc");
		List<MaintainApply> list = maintainApplyMapper.selectByExample(example);
		
		PageInfo<MaintainApply> pageInfo = new PageInfo<>(list);
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
		long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
		
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
		
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

	@Override
	public EasyUIDataGridResult likeMaintainApplyInfo(Integer page, Integer rows, String value, String address,
			Integer check) {
		// TODO Auto-generated method stub
		System.out.println("value:"+value+"addresss:"+address+"check:"+check);
		//分页处理
		PageHelper.startPage(page, rows);	
		
		MaintainApplyExample example = new MaintainApplyExample();
		example.setOrderByClause("maintain_create desc");
		MaintainApplyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(value)&&!value.equals("null")) {
			criteria.andMaintainNameLike("%"+value+"%");
		}
		if (check!=-1&&check!=null) {
			criteria.andMaintainCheckEqualTo(check);
		}
		if (StringUtils.isNotBlank(address)&&!address.equals("null")) {
			criteria.andMaintainAddressEqualTo(address);
		}
		
		
		List<MaintainApply> list = maintainApplyMapper.selectByExample(example);
		
		PageInfo<MaintainApply> pageInfo = new PageInfo<>(list);
		long totalCount = pageInfo.getTotal();
		long totalPage = (totalCount+rows-1)/rows;

		long nextPage = 0;
		if (page+1 >= totalPage) {
			nextPage = totalPage;
		}else{
			nextPage = page+1;
		}
		long prevPage = 1;
		if (page-1 <= 1) {
			prevPage = 1;
		} else {
			prevPage = page-1;
		}
		
		Integer[] digitalPage;
		digitalPage = DigitalPage.calcPage(page, (int) totalPage, 4);
		
		return new EasyUIDataGridResult(totalCount, totalPage, list, nextPage, prevPage, page, digitalPage);
	}

}
