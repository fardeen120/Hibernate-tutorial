package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pid;
	private String projname;
	
	@ManyToMany
	private List<Emp> employee;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjname() {
		return projname;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public List<Emp> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Emp> employee) {
		this.employee = employee;
	}

	public Project(int pid, String projname, List<Emp> employee) {
		super();
		this.pid = pid;
		this.projname = projname;
		this.employee = employee;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
