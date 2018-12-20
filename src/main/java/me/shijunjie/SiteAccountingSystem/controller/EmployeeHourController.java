package me.shijunjie.SiteAccountingSystem.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;
import me.shijunjie.SiteAccountingSystem.bean.EUDataGridResult;
import me.shijunjie.SiteAccountingSystem.bean.Response;
import me.shijunjie.SiteAccountingSystem.entity.EmployeeHour;
import me.shijunjie.SiteAccountingSystem.service.EmployeeHourService;

@Controller
@Slf4j
public class EmployeeHourController {
	
	@Autowired
	private EmployeeHourService employeeHourService;
	
	@GetMapping("/hourList")
	@ResponseBody
	public EUDataGridResult hourList(String employeeId, Integer page, Integer rows) {
		log.info("EmployeeHourController.hourList.param employeeId:{}", employeeId);
		EUDataGridResult result = new EUDataGridResult();
		PageHelper.startPage(page, rows);
		List<EmployeeHour> hours = employeeHourService.getHoursByEmployeeId(employeeId);
		PageInfo<EmployeeHour> pageInfo = new PageInfo<EmployeeHour>(hours);
		result.setRows(pageInfo.getList());
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@PostMapping("/addEmployeeHour")
	@ResponseBody
	public Response addEmployeeHour(String employeeId, String employeeName, String workingTime, String workingDate) throws ParseException {
		log.info("addEmployeeHour:{},{},{},{}", employeeId, employeeName, workingTime, workingDate);
		EmployeeHour employeeHour = new EmployeeHour();
		employeeHour.setEmployeeId(Integer.parseInt(employeeId));
		employeeHour.setWorkingTime(new BigDecimal(workingTime));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		employeeHour.setWorkingDate(format.parse(workingDate));
		employeeHourService.addEmployeeHour(employeeHour);
		return Response.ok("成功");
	}
	
	@PostMapping("/delEmployeeHour")
	@ResponseBody
	public Response delEmployeeHour(String hourId) throws ParseException {
		log.info("delEmployeeHour:{}", hourId);
		employeeHourService.delEmployeeHour(hourId);
		return Response.ok("成功");
	}
	
}
