package com.jsp.hibernate.MyFIrstHibProject.Person_Pan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int PersonId;
	private String personName;
	private int personContact;
	@OneToOne
	public Pan pan;
	@OneToOne
	public Passport passport;

	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonContact() {
		return personContact;
	}
	public void setPersonContact(int personContact) {
		this.personContact = personContact;
	}
	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", personName=" + personName + ", personContact=" + personContact
				+ ", pan=" + pan + "]";
	}

}
