package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IPartnerBiz;
import entrepreneurialcenter.office.dao.PartnerMapper;
import entrepreneurialcenter.office.pojo.Partner;
import entrepreneurialcenter.office.pojo.PartnerExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class PartnerBizImpl implements IPartnerBiz {

	@Autowired
	private PartnerMapper partnerMapper;
	
	@Override
	public List<Partner> getAllPartnerInfo() {
		// TODO Auto-generated method stub
		PartnerExample example = new PartnerExample();
		example.setOrderByClause("partner_created desc");
		return partnerMapper.selectByExample(example);
	}

	@Override
	public Integer getAllPartnerCount() {
		// TODO Auto-generated method stub
		return partnerMapper.countByExample(new PartnerExample());
	}

	@Override
	public String getPartnerById(Long id) {
		// TODO Auto-generated method stub
		Partner partner = partnerMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(partner);
	}

	@Override
	public Result addPartner(Partner record) {
		// TODO Auto-generated method stub
		record.setPartnerCreated((int) (System.currentTimeMillis()/1000));
		if (partnerMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delPartner(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = partnerMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updatePartner(Partner record) {
		// TODO Auto-generated method stub
		Partner partner = partnerMapper.selectByPrimaryKey(record.getId());
		partner.setPartnerAddress(record.getPartnerAddress());
		partner.setPartnerIndustry(record.getPartnerIndustry());
		partner.setPartnerName(record.getPartnerName());
		partner.setPartnerScope(record.getPartnerScope());
		partner.setPartnerUpdate((int) (System.currentTimeMillis()/1000));
		if (partnerMapper.updateByPrimaryKey(partner) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult likePartnerInfo(Integer page, Integer rows, String value, String indString) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);
		
		System.out.println("value:"+value+"indString:"+indString);
		PartnerExample example = new PartnerExample();
		example.setOrderByClause("partner_created desc");
		PartnerExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(indString)&&!indString.equals("null")) {
			criteria.andPartnerIndustryLike("%"+indString+"%");
		}
		if (StringUtils.isNotBlank(value)&&!value.equals("null")) {
			criteria.andPartnerNameLike("%"+value+"%");
			//criteria.andPartnerAddressLike("%"+likeInfo+"%");
		}
		
		
		List<Partner> list = partnerMapper.selectByExample(example);
		
		PageInfo<Partner> pageInfo = new PageInfo<>(list);
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
	public List<Partner> likePartnerAllInfo(String value) {
		// TODO Auto-generated method stub
		PartnerExample example = new PartnerExample();
		example.setOrderByClause("partner_created desc");
		PartnerExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(value)&&!value.equals("null")) {
			criteria.andPartnerNameLike("%"+value+"%");
		}
		return partnerMapper.selectByExample(example);
	}

}
