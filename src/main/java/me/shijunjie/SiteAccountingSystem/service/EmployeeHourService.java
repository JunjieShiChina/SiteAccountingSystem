package me.shijunjie.SiteAccountingSystem.service;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.EmployeeHour;

public interface EmployeeHourService {

	List<EmployeeHour> getHoursByEmployeeId(String employeeId);

	void addEmployeeHour(EmployeeHour employeeHour);

	void delEmployeeHour(String hourId);

}
