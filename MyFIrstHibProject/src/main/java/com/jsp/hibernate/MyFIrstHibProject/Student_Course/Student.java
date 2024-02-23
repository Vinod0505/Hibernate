package com.jsp.hibernate.MyFIrstHibProject.Student_Course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	 private int studentId;
	 private String studentName;
	 @ManyToMany(mappedBy = "sList")
	 private List<Course> cList = new ArrayList<Course>();
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", cList=" + cList + "]";
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
	public List<Course> getcList() {
		return cList;
	}
	public void setcList(List<Course> cList) {
		this.cList = cList;
	}
	 
}
