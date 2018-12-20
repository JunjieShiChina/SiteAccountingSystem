package me.shijunjie.SiteAccountingSystem.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import me.shijunjie.SiteAccountingSystem.dao.EmployeeDao;
import me.shijunjie.SiteAccountingSystem.entity.Employee;
import me.shijunjie.SiteAccountingSystem.entity.EmployeeExample;
import me.shijunjie.SiteAccountingSystem.entity.EmployeeExample.Criteria;
import me.shijunjie.SiteAccountingSystem.mapper.EmployeeMapper;

@Service
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> selectAllEmployeeByProjectId(String projectId, String employeeName) {
		EmployeeExample wheres = new EmployeeExample();
		Criteria createCriteria = wheres.createCriteria();
		createCriteria.andProjectIdEqualTo(Integer.parseInt(projectId));
		if(!StringUtils.isBlank(employeeName)) {
			createCriteria.andEmployeeNameLike("%"+employeeName+"%");
		}
		return employeeMapper.selectByExample(wheres);
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeMapper.insertSelective(employee);
	}

	@Override
	public int selectHourSalaryByEmployeeId(String employeeId) {
		return employeeMapper.selectByPrimaryKey(Integer.parseInt(employeeId)).getHourSalary();
	}

	@Override
	public void updateEmployeeFinish(Employee employee) {
		employeeMapper.updateByPrimaryKeySelective(employee);
	}

	@Override
	public String selectEmployeeNameById(String employeeId) {
		return employeeMapper.selectByPrimaryKey(Integer.parseInt(employeeId)).getEmployeeName();
	}

}
