package com.groom.Hibernate_Project_otm;

import java.util.List;


public interface ICountryState {
	
		void addCountry(Country c);
		void addState(State s,int countryId);
		Country findCountryById(int countryId);
		List<Country> findCountryByName(String countryName);
		List<Country> findAllCountries();
		void updatePopulationByCountryId(int countryPopulation,int countryId);
		List<Country> findCountriesByContinents(String continent);
		Country findCountryByPresident(String countryPresident);
		void deleteCountryById(int countryId);
		void deleteCountryByName(String countryName);
		void updatePresidentByCountryName(String countryPresident,String countryName);
		State findStateById(int stateId);
		State findStateByName(String stateName);
		State findStateByCheifMinister(String stateCheifMinister);
		List<State> findStatesByCountryId(int countryId);
		List<State> findStatesBycountryName(int countryId,String countryName);
		void updateStatePopulationByName(int statePopulation,String stateName);
		void deleteStateByName(String stateName);
		void deleteAllStatesBYCountryId(int countryId);
		
}
