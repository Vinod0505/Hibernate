package com.jsp.hibernate.MyFIrstHibProject.Student_College;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	public int getcoolegeId() {
		return collegeId;
	}
	public void setcollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getcollegeName() {
		return collegeName;
	}
	public void setcollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}
}
