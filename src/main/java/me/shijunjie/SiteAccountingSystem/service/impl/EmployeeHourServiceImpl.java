package me.shijunjie.SiteAccountingSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.EmployeeHourDao;
import me.shijunjie.SiteAccountingSystem.entity.EmployeeHour;
import me.shijunjie.SiteAccountingSystem.service.EmployeeHourService;

@Service
public class EmployeeHourServiceImpl implements EmployeeHourService {
	
	@Autowired
	private EmployeeHourDao employeeHourDao;

	@Override
	public List<EmployeeHour> getHoursByEmployeeId(String employeeId) {
		return employeeHourDao.selectHoursByEmployeeId(employeeId);
	}

	@Override
	public void addEmployeeHour(EmployeeHour employeeHour) {
		employeeHourDao.insertEmployeeHour(employeeHour);
		
	}

	@Override
	public void delEmployeeHour(String hourId) {
		employeeHourDao.delEmployeeHour(hourId);
	}

}
