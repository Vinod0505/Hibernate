package com.jsp.hibernate.MyFIrstHibProject.Student_College;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private long studnetContactNo;
	private double studentPercentage;
	@OneToOne
	private College college;

	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getStudnetContactNo() {
		return studnetContactNo;
	}
	public void setStudnetContactNo(long studnetContactNo) {
		this.studnetContactNo = studnetContactNo;
	}
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studnetContactNo="
				+ studnetContactNo + ", studentPercentage=" + studentPercentage + "]";
	}


}
