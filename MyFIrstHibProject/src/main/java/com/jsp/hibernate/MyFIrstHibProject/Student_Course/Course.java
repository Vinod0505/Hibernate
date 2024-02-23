package com.jsp.hibernate.MyFIrstHibProject.Student_Course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private int courseId;
	private String coursesName;
	private double coursePrice;
	@ManyToMany
	private List<Student> sList = new ArrayList<Student>();
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", coursesName=" + coursesName + ", coursePrice=" + coursePrice
				+ ", sList=" + sList + "]";
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	public List<Student> getsList() {
		return sList;
	}
	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
	
	
}
