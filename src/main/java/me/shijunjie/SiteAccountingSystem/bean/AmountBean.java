package me.shijunjie.SiteAccountingSystem.bean;

import java.math.BigDecimal;
import java.util.Date;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class AmountBean {
	
	private Integer amountType; // 金额类型（0收入，1支出）
	
	private BigDecimal workingTime; // 工时（收入，支出就是0）
	
	private Date logDate; // 工时或者支出的日期
	
	private BigDecimal amount; // 单条记录的金额

	public Integer getAmountType() {
		return amountType;
	}

	public void setAmountType(Integer amountType) {
		this.amountType = amountType;
	}

	public BigDecimal getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(BigDecimal workingTime) {
		this.workingTime = workingTime;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
