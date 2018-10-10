package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IComProjectsBiz;
import entrepreneurialcenter.office.dao.ComProjectsMapper;
import entrepreneurialcenter.office.pojo.ComProjects;
import entrepreneurialcenter.office.pojo.ComProjectsExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class ComProjectsBizImpl implements IComProjectsBiz {

	@Autowired
	private ComProjectsMapper comProjectsMapper;
	
	@Override
	public List<ComProjects> getAllComProjectsInfo() {
		// TODO Auto-generated method stub
		return comProjectsMapper.selectByExample(new ComProjectsExample());
	}

	@Override
	public Integer getAllComProjectsCount() {
		// TODO Auto-generated method stub
		return comProjectsMapper.countByExample(new ComProjectsExample());
	}

	@Override
	public String getComProjectsById(Long id) {
		// TODO Auto-generated method stub
		ComProjects projects = comProjectsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(projects);
	}

	@Override
	public Result addComProjects(ComProjects record) {
		// TODO Auto-generated method stub
		if (comProjectsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delComProjects(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = comProjectsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateComProjects(ComProjects record) {
		// TODO Auto-generated method stub
		ComProjects projects = comProjectsMapper.selectByPrimaryKey(record.getProjectId());
		projects.setComId(record.getComId());
		//projects.setCreated(record.getCreated());
		projects.setProjectAllmoney(record.getProjectAllmoney());
		projects.setProjectInd(record.getProjectInd());
		projects.setProjectMoney(record.getProjectMoney());
		projects.setProjectName(record.getProjectName());
		projects.setProjectStatus(record.getProjectStatus());
		projects.setProjectTime(record.getProjectTime());
		projects.setProjectType(record.getProjectType());
		projects.setUpdated(record.getUpdated());
		
		if (comProjectsMapper.updateByPrimaryKey(projects) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
