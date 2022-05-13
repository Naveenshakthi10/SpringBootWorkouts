package com.example.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "organisation")
public class Organisation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",insertable = false,updatable = false)
	private long id;
	
	@Column(name = "organisation_name",nullable = false)
    private String OrganisationName;
	
	@Column(name = "branch_name")
	private String branchname;
	
	@Column(name = "adress",nullable = false)
	private String address;
	
	@Column(name = "year")
	private int year;
	
	@Column(name = "total_employees")
	private int totalemployees;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrganisationName() {
		return OrganisationName;
	}

	public void setOrganisationName(String organisationName) {
		OrganisationName = organisationName;
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
