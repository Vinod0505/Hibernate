package com.jsp.hibernate.MavenProject2.company_Department;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {
	@Id
	private int companyId;
	private String companyName;
	
	@OneToMany(mappedBy = "company")
	private List<Department> depList = new ArrayList<Department>();
	
	@OneToMany(mappedBy = "com")
	private List<Employee> empList = new ArrayList<Employee>();
	
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Department> getDepList() {
		return depList;
	}
	public void setDepList(List<Department> depList) {
		this.depList = depList;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}






}
