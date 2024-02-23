package com.jsp.hibernate.MyFIrstHibProject.Student_Subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubjectMapping {
	@Id
	private int subjectId;
	private String subjectName;
	@ManyToOne
	private StudentMapping studentMapping;
	
	public StudentMapping getStudentMapping() {
		return studentMapping;
	}
	public void setStudentMapping(StudentMapping studentMapping) {
		this.studentMapping = studentMapping;
	}
	@Override
	public String toString() {
		return "SubjectMapping [subjectId=" + subjectId + ", subjectName=" + subjectName + ", studentMapping="
				+ studentMapping + "]";
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
}
