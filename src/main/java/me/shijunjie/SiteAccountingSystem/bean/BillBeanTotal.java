package me.shijunjie.SiteAccountingSystem.bean;

public class BillBeanTotal {

	private double totalHour; // 总工时
	
	private double totalIn; // 总收入
	
	private double totalOut; // 总支出
	
	private double finalIn; // 最终收入

	public double getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(double totalHour) {
		this.totalHour = totalHour;
	}

	public double getTotalIn() {
		return totalIn;
	}

	public void setTotalIn(double totalIn) {
		this.totalIn = totalIn;
	}

	public double getTotalOut() {
		return totalOut;
	}

	public void setTotalOut(double totalOut) {
		this.totalOut = totalOut;
	}

	public double getFinalIn() {
		return finalIn;
	}

	public void setFinalIn(double finalIn) {
		this.finalIn = finalIn;
	}

}
