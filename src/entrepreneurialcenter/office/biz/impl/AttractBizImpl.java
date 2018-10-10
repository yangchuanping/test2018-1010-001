package entrepreneurialcenter.office.biz.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entrepreneurialcenter.office.biz.IAttractBiz;
import entrepreneurialcenter.office.dao.AttractMapper;
import entrepreneurialcenter.office.pojo.Attract;
import entrepreneurialcenter.office.pojo.AttractExample;
import entrepreneurialcenter.office.util.DigitalPage;
import entrepreneurialcenter.office.util.EasyUIDataGridResult;
import entrepreneurialcenter.office.util.Result;

@Service
public class AttractBizImpl implements IAttractBiz {

	@Autowired
	private AttractMapper attractMapper;
	
	@Override
	public List<Attract> getAllAttractInfo() {
		// TODO Auto-generated method stub
		return attractMapper.selectByExample(new AttractExample());
	}

	@Override
	public Integer getAllAttractCount() {
		// TODO Auto-generated method stub
		return attractMapper.countByExample(new AttractExample());
	}

	@Override
	public String getAttractById(Integer id) {
		// TODO Auto-generated method stub
		Attract attract = attractMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(attract);
	}

	@Override
	public Result addAttract(Attract record) {
		// TODO Auto-generated method stub
		record.setAttractCreated(new Date());
		if (attractMapper.insert(record) == 0) {
			return Result.build(500, "新增失败！");
		}
		return Result.ok();
	}

	@Override
	public Result delAttract(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = attractMapper.deleteByPrimaryKey(Integer.parseInt(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "删除失败！");
		}
		return Result.ok();
	}

	@Override
	public Result updateAttract(Attract record) {
		// TODO Auto-generated method stub
		Attract attract = attractMapper.selectByPrimaryKey(record.getAttractId());
		attract.setAttractName(record.getAttractName());
		attract.setAttractContent(record.getAttractContent());
		attract.setAttractAddress(record.getAttractAddress());
		attract.setAttractTraffic(record.getAttractTraffic());
		attract.setAttractGarden(record.getAttractGarden());
		attract.setAttractArea(record.getAttractArea());
		attract.setAttractStation(record.getAttractStation());
		attract.setAttractDecoration(record.getAttractDecoration());
		attract.setAttractRate(record.getAttractRate());
		attract.setAttractRentfree(record.getAttractRentfree());
		attract.setAttractStatus(record.getAttractStatus());
		attract.setAttractPhone(record.getAttractPhone());
		
		if (attractMapper.updateByPrimaryKey(attract) == 0) {
			return Result.build(500, "更新失败！");
		}
		return Result.ok();
	}

	@Override
	public EasyUIDataGridResult likeAttractInfo(Integer page, Integer rows, String value, String garden, String area) {
		// TODO Auto-generated method stub
		//分页处理
		PageHelper.startPage(page, rows);	
		
		AttractExample example = new AttractExample();
		example.setOrderByClause("attract_created desc");
		AttractExample.Criteria criteria = example.createCriteria();
		criteria.andAttractStatusEqualTo("1");
		if (StringUtils.isNotBlank(value)&&!value.equals("null")) {
			criteria.andAttractNameLike("%"+value+"%");
		}
		if (StringUtils.isNotBlank(garden)&&!garden.equals("null")) {
			criteria.andAttractGardenEqualTo(garden);
		}
		if (StringUtils.isNotBlank(area)&&!area.equals("null")) {
			 String[] sourceStrArray = area.split("-");
			 if (sourceStrArray.length==1) {
				 criteria.andAttractAreaGreaterThan(Integer.parseInt(sourceStrArray[0]));
			}else{
				criteria.andAttractAreaBetween(Integer.parseInt(sourceStrArray[0]), Integer.parseInt(sourceStrArray[1]));
			}
		}
		
		List<Attract> list = attractMapper.selectByExample(example);
		PageInfo<Attract> pageInfo = new PageInfo<>(list);
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
	public EasyUIDataGridResult likeAttractInfoBackPage(Integer page, Integer rows, String garden, String area, String status) {
		// TODO Auto-generated method stub
		//分页处理
				PageHelper.startPage(page, rows);	
				
				AttractExample example = new AttractExample();
				example.setOrderByClause("attract_created desc");
				AttractExample.Criteria criteria = example.createCriteria();
				if (StringUtils.isNotBlank(garden)&&!garden.equals("null")) {
					criteria.andAttractGardenEqualTo(garden);
				}
				if (StringUtils.isNotBlank(area)&&!area.equals("null")) {
					 String[] sourceStrArray = area.split("-");
					 if (sourceStrArray.length==1) {
						 criteria.andAttractAreaGreaterThan(Integer.parseInt(sourceStrArray[0]));
					}else{
						criteria.andAttractAreaBetween(Integer.parseInt(sourceStrArray[0]), Integer.parseInt(sourceStrArray[1]));
					}
				}
				if (StringUtils.isNotBlank(status)&&!status.equals("null")) {
					criteria.andAttractStatusEqualTo(status);
				}
				
				List<Attract> list = attractMapper.selectByExample(example);
				PageInfo<Attract> pageInfo = new PageInfo<>(list);
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
