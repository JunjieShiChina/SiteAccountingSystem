package me.shijunjie.SiteAccountingSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.common.Constant;
import me.shijunjie.SiteAccountingSystem.dao.EmployeeDao;
import me.shijunjie.SiteAccountingSystem.entity.Employee;
import me.shijunjie.SiteAccountingSystem.service.EmployeeService;

@Service
public class EmployeeSereviceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployeeByProjectId(String projectId, String employeeName) {
		return employeeDao.selectAllEmployeeByProjectId(projectId, employeeName);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Override
	public int getHourSalaryByEmployeeId(String employeeId) {
		return employeeDao.selectHourSalaryByEmployeeId(employeeId);
	}

	@Override
	public void setEmployeeFinish(String employeeId) {
		Employee employee = new Employee();
		employee.setId(Integer.parseInt(employeeId));
		employee.setFinishFlag(Constant.EMPLOYEE_CHECKOUT_STATUS_FINISHED);
		employeeDao.updateEmployeeFinish(employee);
	}

	@Override
	public String getEmployeeNameById(String employeeId) {
		return employeeDao.selectEmployeeNameById(employeeId);
	}

}
