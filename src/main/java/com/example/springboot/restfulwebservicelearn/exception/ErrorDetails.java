package com.example.springboot.restfulwebservicelearn.exception;

import java.time.LocalDate;

public class ErrorDetails {
	// timestamp
	// message
	// details

	private LocalDate timestamp;
	private String message;
	private String detail;

	public ErrorDetails(LocalDate timestamp, String message, String detail) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detail = detail;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "ErrorDetails [timestamp=" + timestamp + ", message=" + message + ", detail=" + detail + "]";
	}

}
