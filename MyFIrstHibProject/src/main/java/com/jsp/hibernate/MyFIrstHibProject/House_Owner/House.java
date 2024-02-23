package com.jsp.hibernate.MyFIrstHibProject.House_Owner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class House {

	@Id
	private int hId;
	private int hRent;
	private String hLocation;


	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public String gethLocation() {
		return hLocation;
	}
	public void sethLocation(String hLocation) {
		this.hLocation = hLocation;
	}
	public int gethRent() {
		return hRent;
	}
	public void sethRent(int hRent) {
		this.hRent = hRent;
	}
	@Override
	public String toString() {
		return "House [hId=" + hId + ", hRent=" + hRent + ", hLocation=" + hLocation + "]";
	}


}
