package me.shijunjie.SiteAccountingSystem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import me.shijunjie.SiteAccountingSystem.bean.AmountBean;
import me.shijunjie.SiteAccountingSystem.dao.BillDao;
import me.shijunjie.SiteAccountingSystem.entity.Bill;
import me.shijunjie.SiteAccountingSystem.entity.BillExample;
import me.shijunjie.SiteAccountingSystem.mapper.BillMapper;

@Service
public class BillDaoImpl implements BillDao {
	
	@Autowired
	private BillMapper billMapper;

	@Override
	public List<AmountBean> selectAmountBeanByEmployeeId(String employeeId) {
		return billMapper.selectAmountBeanByEmployeeId(Integer.parseInt(employeeId));
	}

	@Override
	public void insertBill(Bill bill) {
		billMapper.insertSelective(bill);
	}

	@Override
	public String selectCaculateResultByEmployeeId(String employeeId) {
		String result = "{}";
		BillExample wheres = new BillExample();
		wheres.createCriteria().andEmployeeIdEqualTo(Integer.valueOf(employeeId));
		List<Bill> bills = billMapper.selectByExample(wheres);
		if(!CollectionUtils.isEmpty(bills)) {
			result = bills.get(0).getBillJson();
		}
		return result;
	}

}
