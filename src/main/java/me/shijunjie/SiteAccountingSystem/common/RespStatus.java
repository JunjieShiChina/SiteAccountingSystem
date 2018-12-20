package me.shijunjie.SiteAccountingSystem.common;

public enum RespStatus {
	SUCCESS(200, "成功");

	private int value;
	private String message;

	RespStatus(int value, String message) {
		this.value = value;
		this.message = message;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
