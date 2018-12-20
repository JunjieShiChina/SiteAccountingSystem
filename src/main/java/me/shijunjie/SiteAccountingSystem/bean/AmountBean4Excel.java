package me.shijunjie.SiteAccountingSystem.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;
import me.shijunjie.SiteAccountingSystem.util.DateUtils;

public class AmountBean4Excel {
	
	public AmountBean4Excel() {

	}
	
	public AmountBean4Excel(AmountBean amountBean) {
		this.amountType = amountBean.getAmountType().toString();
		this.workingTime = amountBean.getWorkingTime().toString();
		this.logDate = DateUtils.data2Str(amountBean.getLogDate(), "yyyy-MM-dd");
		this.amount = amountBean.getAmount().toString();
	}

	@Excel(name = "金额类型", replace = {"收入_0", "支出_1"}, orderNum = "0")
	private String amountType; // 金额类型（0收入，1支出）

	@Excel(name = "工时（单位：小时）", orderNum = "1")
	private String workingTime; // 工时（收入，支出就是0）

	@Excel(name = "日期", orderNum = "2")
	private String logDate; // 工时或者支出的日期

	@Excel(name = "金额", orderNum = "3")
	private String amount; // 单条记录的金额

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public String getLogDate() {
		return logDate;
	}

	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
