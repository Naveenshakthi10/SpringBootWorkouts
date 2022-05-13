package com.example.demo.Dto;

public class OrganisationDto {
	
	private long id; 

	private String OragnisationName;
	
	private String branchname;
	
	private String address;
	
	private int year;
	
	private int totalemployees;
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getOragnisationName() {
		return OragnisationName;
	}

	public void setOragnisationName(String oragnisationName) {
		OragnisationName = oragnisationName;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalemployees() {
		return totalemployees;
	}

	public void setTotalemployees(int totalemployees) {
		this.totalemployees = totalemployees;
	}
	
}
