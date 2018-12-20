package me.shijunjie.SiteAccountingSystem.dao;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.bean.AmountBean;
import me.shijunjie.SiteAccountingSystem.entity.Bill;

public interface BillDao {

	List<AmountBean> selectAmountBeanByEmployeeId(String employeeId);

	void insertBill(Bill bill);

	String selectCaculateResultByEmployeeId(String employeeId);

}
