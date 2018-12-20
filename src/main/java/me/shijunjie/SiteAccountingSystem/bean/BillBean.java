package me.shijunjie.SiteAccountingSystem.bean;

import java.util.List;
import java.util.Map;

public class BillBean {
	
	private Integer total;
	
	private List<AmountBean> rows;
	
	private List<Map<String,Object>> footer;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<AmountBean> getRows() {
		return rows;
	}

	public void setRows(List<AmountBean> rows) {
		this.rows = rows;
	}

	public List<Map<String, Object>> getFooter() {
		return footer;
	}

	public void setFooter(List<Map<String, Object>> footer) {
		this.footer = footer;
	}

}
