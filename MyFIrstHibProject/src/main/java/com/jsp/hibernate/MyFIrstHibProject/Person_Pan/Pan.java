package com.jsp.hibernate.MyFIrstHibProject.Person_Pan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {
	@Id
	private int panId;
	private String nameOnPan;
	private String locOnPan;
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getNameOnPan() {
		return nameOnPan;
	}
	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}
	public String getLocOnPan() {
		return locOnPan;
	}
	public void setLocOnPan(String locOnPan) {
		this.locOnPan = locOnPan;
	}
	@Override
	public String toString() {
		return "Pan [panId=" + panId + ", nameOnPan=" + nameOnPan + ", locOnPan=" + locOnPan + "]";
	}


}
