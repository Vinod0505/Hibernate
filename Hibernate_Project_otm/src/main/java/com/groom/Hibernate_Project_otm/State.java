package com.groom.Hibernate_Project_otm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {

	@Id
	private int stateId;
	private String stateName;
	private int statePopulation;
	private String stateCheifMinister;
	
	@ManyToOne
	private Country country;
	
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getStatePopulation() {
		return statePopulation;
	}
	public void setStatePopulation(int statePopulation) {
		this.statePopulation = statePopulation;
	}
	public String getStateCheifMinister() {
		return stateCheifMinister;
	}
	public void setStateCheifMinister(String stateCheifMinister) {
		this.stateCheifMinister = stateCheifMinister;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", statePopulation=" + statePopulation
				+ ", stateCheifMinister=" + stateCheifMinister + ", country=" + country + "]";
	}




}
