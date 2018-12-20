package me.shijunjie.SiteAccountingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;
import me.shijunjie.SiteAccountingSystem.bean.EUDataGridResult;
import me.shijunjie.SiteAccountingSystem.bean.Response;
import me.shijunjie.SiteAccountingSystem.entity.Employee;
import me.shijunjie.SiteAccountingSystem.service.EmployeeService;

@Controller
@Slf4j
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/toEmployees")
	public String toEmployees(String projectId, Model model) {
		model.addAttribute("ProjectId", projectId);
		return "view/employees";
	}
	
	@GetMapping("/employeeList")
	@ResponseBody
	public EUDataGridResult employeeList(String projectId,String employeeName, Integer page, Integer rows) {
		log.info("EmployeeController.employeeList");
		EUDataGridResult result = new EUDataGridResult();
		PageHelper.startPage(page, rows);
		List<Employee> employees = employeeService.getAllEmployeeByProjectId(projectId, employeeName);
		PageInfo<Employee> pageInfo = new PageInfo<Employee>(employees);
		result.setRows(pageInfo.getList());
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@PostMapping("/addEmployee")
	@ResponseBody
	public Response addEmployee(String projectId, String employeeName, String hourSalary, String phoneNumber) {
		log.info("EmployeeController.addEmployee.param {},{},{},{}", projectId, employeeName, hourSalary, phoneNumber);
		Employee employee = new Employee();
		employee.setProjectId(Integer.parseInt(projectId));
		employee.setEmployeeName(employeeName);
		employee.setHourSalary(Integer.parseInt(hourSalary));
		employee.setPhoneNumber(phoneNumber);
		employeeService.addEmployee(employee);
		return Response.ok("添加成功");
	}
}
