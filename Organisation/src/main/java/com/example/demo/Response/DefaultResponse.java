package com.example.demo.Response;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class DefaultResponse {
	
	private Date timestamp;
	private String message;
	private HttpStatus status;
	
	
	
	public DefaultResponse(Date timestamp, String message, HttpStatus status) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	

}
