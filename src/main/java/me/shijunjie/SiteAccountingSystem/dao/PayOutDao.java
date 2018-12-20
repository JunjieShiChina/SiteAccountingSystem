package me.shijunjie.SiteAccountingSystem.dao;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.PayOut;

public interface PayOutDao {

	List<PayOut> selectPaysByEmployeeId(String employeeId);

	void insertPayOut(PayOut payOut);

	void deletePayOut(String payId);

}
