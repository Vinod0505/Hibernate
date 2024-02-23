package com.jsp.hibernate.MyFIrstHibProject.Person_Vehicle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PersonMapping {
	@Id
	private int personId;
	private String personName;
	@OneToMany
	private List<VehicleMapping> vehList = new ArrayList<VehicleMapping>();

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<VehicleMapping> getVehList() {
		return vehList;
	}

	public void setVehList(List<VehicleMapping> vehList) {
		this.vehList = vehList;
	}

	@Override
	public String toString() {
		return "PersonMapping [personId=" + personId + ", personName=" + personName + ", vehList=" + vehList + "]";
	}

}
