package me.shijunjie.SiteAccountingSystem.service;

import java.util.List;

import me.shijunjie.SiteAccountingSystem.entity.PayOut;

public interface PayOutService {

	List<PayOut> getPaysByEmployeeId(String employeeId);

	void addPayOut(PayOut payOut);

	void delPayOut(String payId);

}
