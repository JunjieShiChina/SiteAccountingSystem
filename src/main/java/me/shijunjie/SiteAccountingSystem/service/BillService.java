package me.shijunjie.SiteAccountingSystem.service;

import java.util.List;
import java.util.Map;

import me.shijunjie.SiteAccountingSystem.bean.AmountBean;

public interface BillService {

	List<Map<String, Object>> cacuLate(List<AmountBean> rows, String employeeId);

	List<AmountBean> getAmountBeanByEmployeeId(String employeeId);

	void comfirmCaculate(String employeeId, String jsonStr);

	String getCaculateResultByEmployeeId(String employeeId);

}
