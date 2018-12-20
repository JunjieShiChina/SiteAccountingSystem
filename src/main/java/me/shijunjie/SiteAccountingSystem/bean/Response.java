package me.shijunjie.SiteAccountingSystem.bean;

import java.io.Serializable;

import me.shijunjie.SiteAccountingSystem.common.RespStatus;

public class Response implements Serializable {
	private static final long serialVersionUID = 1312432543653623L;
	private int status;
	private String code;
	private String message;
	private Object data;

	public Response() {
	}

	public Response(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public Response(RespStatus respStatus) {
		this.status = respStatus.getValue();
		this.message = respStatus.getMessage();
	}

	public static Response build(RespStatus respStatus) {
		return new Response(respStatus);
	}

	public static Response ok() {
		return new Response(RespStatus.SUCCESS);
	}
	
	public static Response ok(Object data) {
		Response response = new Response(RespStatus.SUCCESS);
		response.setData(data);
		return response;
	}
	
	public static Response ok(String message) {
		return new Response(RespStatus.SUCCESS.getValue(), message);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
