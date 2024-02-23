package com.jsp.hibernate.MyFIrstHibProject.Person_Pan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	@Id
	private int passportId;
	private String nameOnPassport;
	private String locOnPassport;
	
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getNameOnPassport() {
		return nameOnPassport;
	}
	public void setNameOnPassport(String nameOnPassport) {
		this.nameOnPassport = nameOnPassport;
	}
	public String getLocOnPassport() {
		return locOnPassport;
	}
	public void setLocOnPassport(String locOnPassport) {
		this.locOnPassport = locOnPassport;
	}
	
}
