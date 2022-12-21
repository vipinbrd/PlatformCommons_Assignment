package com.StudentManagmentSystem.Exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<ExceptionDetails> studentException(StudentException se, WebRequest req) {
		ExceptionDetails exDttl = new ExceptionDetails();
		exDttl.setMessage(se.getMessage());
		exDttl.setTimestamp(LocalDate.now());
		exDttl.setDetails(req.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exDttl, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(CourseNotFoundException.class)
	public ResponseEntity<ExceptionDetails> courseNotFoundException(CourseNotFoundException cne, WebRequest req) {

		ExceptionDetails exDttl = new ExceptionDetails();
		exDttl.setMessage(cne.getMessage());
		exDttl.setTimestamp(LocalDate.now());
		exDttl.setDetails(req.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exDttl, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> allOtherException(Exception e, WebRequest req) {

		ExceptionDetails exDttl = new ExceptionDetails();
		exDttl.setMessage(e.getMessage());
		exDttl.setTimestamp(LocalDate.now());
		exDttl.setDetails(req.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(exDttl, HttpStatus.BAD_REQUEST);

	}

}
