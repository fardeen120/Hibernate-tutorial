package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Emp {
	
	@Id
	@Column(name = "eid")
	private int empid;
	private String empname;
	
	@ManyToMany
	private List<Project>project;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Emp(int empid, String empname, List<Project> project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.project = project;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
