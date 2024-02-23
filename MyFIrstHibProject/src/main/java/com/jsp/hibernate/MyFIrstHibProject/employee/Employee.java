package com.jsp.hibernate.MyFIrstHibProject.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_employee")
public class Employee {
	@Id
	@Column(name="company_empId")
	private int empId;
	@Column(name="company_empName")
	private String empName;
	@Column(name="company_empSalary")
	private double empSalary;


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSal(double empSalary) {
		this.empSalary=empSalary;
	}
	@Override
	public String toString() {
		return "Employee Id: "+empId+" Employee Name: "+empName+" Employee Salary: "+empSalary;
	}
}
