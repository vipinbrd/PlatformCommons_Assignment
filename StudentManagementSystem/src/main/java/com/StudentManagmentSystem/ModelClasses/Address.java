package com.StudentManagmentSystem.ModelClasses;



@javax.persistence.Entity
public class Address {
	@javax.persistence.Id
	private Integer id;
	private String area;
	private String state;
	private String district;
	private Integer pincode;
	private String addressType;
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Address(Integer id, String area, String state, String district, Integer pincode, String addressType) {
		super();
		this.id = id;
		this.area = area;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.addressType = addressType;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
