package entrepreneurialcenter.office.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import entrepreneurialcenter.office.biz.IDepartmentsBiz;
import entrepreneurialcenter.office.dao.DepartmentsMapper;
import entrepreneurialcenter.office.pojo.Departments;
import entrepreneurialcenter.office.pojo.DepartmentsExample;
import entrepreneurialcenter.office.util.Result;

@Service
public class DepartmentsBizImpl implements IDepartmentsBiz {

	@Autowired
	private DepartmentsMapper departmentsMapper;
	
	@Override
	public List<Departments> getAllDepartmentsInfo() {
		// TODO Auto-generated method stub
		return departmentsMapper.selectByExample(new DepartmentsExample());
	}

	@Override
	public Integer getAllDepartmentsCount() {
		// TODO Auto-generated method stub
		return departmentsMapper.countByExample(new DepartmentsExample());
	}

	@Override
	public String getDepartmentsById(Long id) {
		// TODO Auto-generated method stub
		Departments departments = departmentsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(departments);
	}

	@Override
	public Result addDepartments(Departments record) {
		// TODO Auto-generated method stub
		int num = 1;
        double random = Math.random();
        if (random < 0.1) {
             random = random + 0.1;
        } for (int i = 0; i < 10; i++) {
             num = num * 10;
        }
        
		record.setDepId((long) (random * num));
		record.setDepStatus("1");
		record.setCreated((int) (System.currentTimeMillis()/1000));
		if (departmentsMapper.insert(record) == 0) {
			return Result.build(500, "ÐÂÔöÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result delDepartments(String id) {
		// TODO Auto-generated method stub
		String[] item = id.split(",");
		int ret = 0;
		for (int i = 0; i < item.length; i++) { 
			ret = departmentsMapper.deleteByPrimaryKey(Long.parseLong(item[i])); 
		}
		if (ret == 0) {
			return Result.build(500, "É¾³ýÊ§°Ü£¡");
		}
		return Result.ok();
	}

	@Override
	public Result updateDepartments(Departments record) {
		// TODO Auto-generated method stub
		Departments departments = departmentsMapper.selectByPrimaryKey(record.getDepId());
		departments.setDepTitle(record.getDepTitle());
		departments.setUpdated((int) (System.currentTimeMillis()/1000));
		
		if (departmentsMapper.updateByPrimaryKey(departments) == 0) {
			return Result.build(500, "¸üÐÂÊ§°Ü£¡");
		}
		return Result.ok();
	}

}
