package com.StudentManagmentSystem.Exceptions;

import java.time.LocalDate;

public class ExceptionDetails {
	private LocalDate timestamp;
	private String message;
	private String details;

	public ExceptionDetails(LocalDate timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
