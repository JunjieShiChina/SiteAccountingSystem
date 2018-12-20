package me.shijunjie.SiteAccountingSystem.service;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployeeByProjectId(String projectId, String employeeName);

	public void addEmployee(Employee employee);

	public int getHourSalaryByEmployeeId(String employeeId);

	public void setEmployeeFinish(String employeeId);

	public String getEmployeeNameById(String employeeId);
	
}
