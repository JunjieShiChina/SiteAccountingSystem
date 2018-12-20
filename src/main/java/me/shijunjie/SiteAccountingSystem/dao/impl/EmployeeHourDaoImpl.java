package me.shijunjie.SiteAccountingSystem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.EmployeeHourDao;
import me.shijunjie.SiteAccountingSystem.entity.EmployeeHour;
import me.shijunjie.SiteAccountingSystem.entity.EmployeeHourExample;
import me.shijunjie.SiteAccountingSystem.mapper.EmployeeHourMapper;

@Service
public class EmployeeHourDaoImpl implements EmployeeHourDao {
	
	@Autowired
	private EmployeeHourMapper employeeHourMapper;

	@Override
	public List<EmployeeHour> selectHoursByEmployeeId(String employeeId) {
		EmployeeHourExample wheres = new EmployeeHourExample();
		wheres.createCriteria().andEmployeeIdEqualTo(Integer.parseInt(employeeId));
		return employeeHourMapper.selectByExample(wheres);
	}

	@Override
	public void insertEmployeeHour(EmployeeHour employeeHour) {
		employeeHourMapper.insertSelective(employeeHour);
	}

	@Override
	public void delEmployeeHour(String hourId) {
		employeeHourMapper.deleteByPrimaryKey(Integer.parseInt(hourId));
	}

}
