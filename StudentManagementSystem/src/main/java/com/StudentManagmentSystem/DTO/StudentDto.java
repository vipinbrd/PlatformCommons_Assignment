package com.StudentManagmentSystem.DTO;

public class StudentDto {
	private Integer studentCode;
	private String email;
	private String mobileNo;
	
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDto(String email, String mobileNo) {
		super();
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public Integer getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(Integer studentCode) {
		this.studentCode = studentCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


}
