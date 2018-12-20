package me.shijunjie.SiteAccountingSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.PayOutDao;
import me.shijunjie.SiteAccountingSystem.entity.PayOut;
import me.shijunjie.SiteAccountingSystem.service.PayOutService;

@Service
public class PayOutServiceImpl implements PayOutService {
	
	@Autowired
	private PayOutDao payOutDao;

	@Override
	public List<PayOut> getPaysByEmployeeId(String employeeId) {
		return payOutDao.selectPaysByEmployeeId(employeeId);
	}

	@Override
	public void addPayOut(PayOut payOut) {
		payOutDao.insertPayOut(payOut);
	}

	@Override
	public void delPayOut(String payId) {
		payOutDao.deletePayOut(payId);
	}

}
