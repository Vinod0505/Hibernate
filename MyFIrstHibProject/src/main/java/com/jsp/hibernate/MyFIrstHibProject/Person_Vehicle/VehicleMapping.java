package com.jsp.hibernate.MyFIrstHibProject.Person_Vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VehicleMapping {
	@Id
	private int vehicleId;
	private String vehicleName;
	private double vehiclePrice;
	@ManyToOne
	private PersonMapping personmapping;
	
	
	public PersonMapping getPersonmapping() {
		return personmapping;
	}
	public void setPersonmapping(PersonMapping personmapping) {
		this.personmapping = personmapping;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	@Override
	public String toString() {
		return "VehicleMapping [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehiclePrice="
				+ vehiclePrice + ", personmapping=" + personmapping + "]";
	}
	
}
