package me.shijunjie.SiteAccountingSystem.dao;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.Employee;

public interface EmployeeDao {
	public List<Employee> selectAllEmployeeByProjectId(String projectId, String employeeName);

	public void insertEmployee(Employee employee);

	public int selectHourSalaryByEmployeeId(String employeeId);

	public void updateEmployeeFinish(Employee employee);

	public String selectEmployeeNameById(String employeeId);
}
