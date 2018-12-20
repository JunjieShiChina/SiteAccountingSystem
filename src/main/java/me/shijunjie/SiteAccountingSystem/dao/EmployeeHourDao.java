package me.shijunjie.SiteAccountingSystem.dao;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.EmployeeHour;

public interface EmployeeHourDao {

	List<EmployeeHour> selectHoursByEmployeeId(String employeeId);

	void insertEmployeeHour(EmployeeHour employeeHour);

	void delEmployeeHour(String hourId);

}
