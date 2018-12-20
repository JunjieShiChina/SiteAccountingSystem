package me.shijunjie.SiteAccountingSystem.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.shijunjie.SiteAccountingSystem.bean.AmountBean;
import me.shijunjie.SiteAccountingSystem.common.Constant;
import me.shijunjie.SiteAccountingSystem.dao.BillDao;
import me.shijunjie.SiteAccountingSystem.entity.Bill;
import me.shijunjie.SiteAccountingSystem.service.BillService;
import me.shijunjie.SiteAccountingSystem.service.EmployeeService;

@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private BillDao billDao;

	@Override
	public List<Map<String,Object>> cacuLate(List<AmountBean> rows, String employeeId) {
		ArrayList<Map<String,Object>> result = new ArrayList<>();
		int hourSalary = employeeService.getHourSalaryByEmployeeId(employeeId);
		BigDecimal totalHour = new BigDecimal(0);
		BigDecimal totalIn = new BigDecimal(0);
		BigDecimal totalOut = new BigDecimal(0);
		BigDecimal finalIn = new BigDecimal(0);
		for (AmountBean amountBean : rows) {
			if(amountBean.getAmountType() == Constant.AMOUNT_TYPE_IN) {
				totalHour = totalHour.add(amountBean.getWorkingTime());
			} else if(amountBean.getAmountType() == Constant.AMOUNT_TYPE_OUT) {
				totalOut = totalOut.add(amountBean.getAmount());
			}
		}
		totalIn = totalHour.multiply(new BigDecimal(hourSalary));
		finalIn = totalIn.subtract(totalOut);
		
		Map<String,Object> billBeanTotal = new HashMap<>();
		billBeanTotal.put("amountType", "总工时："+totalHour.doubleValue());
		billBeanTotal.put("workingTime", "总收入："+totalIn.doubleValue());
		billBeanTotal.put("logDate", "总支出："+totalOut.doubleValue());
		billBeanTotal.put("amount", "结账："+finalIn.doubleValue());
		billBeanTotal.put("isFooter", true);
		result.add(billBeanTotal);
		return result;
	}

	@Override
	public List<AmountBean> getAmountBeanByEmployeeId(String employeeId) {
		return billDao.selectAmountBeanByEmployeeId(employeeId);
	}

	@Override
	@Transactional
	public void comfirmCaculate(String employeeId, String jsonStr) {
		// 1.添加账单
		Bill bill = new Bill();
		bill.setEmployeeId(Integer.parseInt(employeeId));
		bill.setBillJson(jsonStr);
		billDao.insertBill(bill);
		// 2.修改状态
		employeeService.setEmployeeFinish(employeeId);
	}

	@Override
	public String getCaculateResultByEmployeeId(String employeeId) {
		String jsonResult = billDao.selectCaculateResultByEmployeeId(employeeId);
		return jsonResult;
	}

}
