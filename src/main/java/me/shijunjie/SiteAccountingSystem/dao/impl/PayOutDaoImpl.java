package me.shijunjie.SiteAccountingSystem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.shijunjie.SiteAccountingSystem.dao.PayOutDao;
import me.shijunjie.SiteAccountingSystem.entity.PayOut;
import me.shijunjie.SiteAccountingSystem.entity.PayOutExample;
import me.shijunjie.SiteAccountingSystem.mapper.PayOutMapper;

@Service
public class PayOutDaoImpl implements PayOutDao {
	
	@Autowired
	private PayOutMapper payOutMapper;

	@Override
	public List<PayOut> selectPaysByEmployeeId(String employeeId) {
		PayOutExample wheres = new PayOutExample();
		wheres.createCriteria().andEmployeeIdEqualTo(Integer.parseInt(employeeId));
		return payOutMapper.selectByExample(wheres);
	}

	@Override
	public void insertPayOut(PayOut payOut) {
		payOutMapper.insertSelective(payOut);
	}

	@Override
	public void deletePayOut(String payId) {
		payOutMapper.deleteByPrimaryKey(Integer.parseInt(payId));
	}
	
}
