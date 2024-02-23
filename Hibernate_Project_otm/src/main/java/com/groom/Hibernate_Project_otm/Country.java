package com.groom.Hibernate_Project_otm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@OneToMany(mappedBy = "country")
	private List<State> l = new ArrayList<State>();

	@Id
	private int countryId;
	private String countryName;
	private String continent;
	private int countryPopulation;
	private String countryPresident;
	private String countryPrimeMinister;
	
	public List<State> getL() {
		return l;
	}
	public void setL(List<State> l) {
		this.l = l;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getCountryPopulation() {
		return countryPopulation;
	}
	public void setCountryPopulation(int countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	public String getCountryPresident() {
		return countryPresident;
	}
	public void setCountryPresident(String countryPresident) {
		this.countryPresident = countryPresident;
	}
	public String getCountryPrimeMinister() {
		return countryPrimeMinister;
	}
	public void setCountryPrimeMinister(String countryPrimeMinister) {
		this.countryPrimeMinister = countryPrimeMinister;
	}
	@Override
	public String toString() {
		return " countryId=" + countryId + ", countryName=" + countryName + ", continent="
				+ continent + ", countryPopulation=" + countryPopulation + ", countryPresident=" + countryPresident
				+ ", countryPrimeMinister=" + countryPrimeMinister + "]";
	}
	

}
