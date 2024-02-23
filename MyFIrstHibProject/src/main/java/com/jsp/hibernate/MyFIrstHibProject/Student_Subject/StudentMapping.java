package com.jsp.hibernate.MyFIrstHibProject.Student_Subject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentMapping {
		@Id
		private int studentId;
		private String studentName;
		@OneToMany
		private List<SubjectMapping> subList = new ArrayList<SubjectMapping>();

		@Override
		public String toString() {
			return "StudentMapping [studentId=" + studentId + ", studentName=" + studentName + ", subList=" + subList
					+ "]";
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

		public List<SubjectMapping> getSubList() {
			return subList;
		}

		public void setSubList(List<SubjectMapping> subList) {
			this.subList = subList;
		}
		
}
