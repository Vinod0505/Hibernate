package com.groom.Hibernate_Project_otm;

import java.util.List; 

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class CountryState_Service implements ICountryState{

	public static Session getSession() {
		Configuration cfg =new Configuration().configure()
				.addAnnotatedClass(Country.class).addAnnotatedClass(State.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	@Override
	public void addCountry(Country c) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		session.save(c);
		trans.commit();
		session.close();
	}

	@Override
	public Country findCountryById(int countryId) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Country country = session.find(Country.class, countryId);
		trans.commit();
		session.close();
		return country;
	}

	@Override
	public List<Country> findCountryByName(String countryName) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from Country where CountryName=:countryName");
		query.setParameter("countryName", countryName);
		List list = query.getResultList();
		trans.commit();
		session.close();
		return list;
	}

	@Override
	public List<Country> findAllCountries() {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<Country> query = session.createQuery("from Country");
		List<Country> list = query.getResultList();
		trans.commit();
		session.close();
		return list;
	}

	@Override
	public List<Country> findCountriesByContinents(String continent) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<Country> query = session.createQuery("from Country where continent=:continent");
		query.setParameter("continent", continent);
		List<Country> list = query.list();
		trans.commit();
		session.close();
		return list;
	}

	@Override
	public Country findCountryByPresident(String countryPresident) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<Country> query = session.createQuery("from Country where countryPresident =:countryPresident");
		query.setParameter("countryPresident", countryPresident);
		Country country = (Country)query.getSingleResult();
		trans.commit();
		session.close();	
		return country;
	}

	@Override
	public void addState(State s,int countryId) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Country country = session.get(Country.class, countryId);
		if(country!=null) {
			s.setCountry(country);
			country.getL().add(s);
			s.setCountry(country);
		}
		trans.commit();
		session.close();	
	}

	@Override
	public void deleteCountryById(int countryId) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Country country = session.get(Country.class, countryId);
		List<State> list = country.getL();
		if(country!=null) {
			for(State s : list ) {
				session.delete(s);
				System.out.println("deleted all states");
			}
			session.delete(country);
			System.out.println("deleted country");
			trans.commit();
		}
		session.close();
	}

	@Override
	public void deleteCountryByName(String countryName) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("delete Country where countryName=:countryName");
		query.setParameter("countryName", countryName);
		Country country =(Country)query.getSingleResult();
		if(country.getL()==null) {
			session.delete(country);
			System.out.println("deleted country");
		}else {
			System.out.println("");
		}
		trans.commit();
		session.close();
	}

	@Override
	public void updatePresidentByCountryName(String countryPresident,String countryName) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<Country> query = session.createQuery("update Country set countryPresident=:countryPresident where countryName=:countryName");
		query.setParameter("countryPresident", countryPresident);
		query.setParameter("countryName", countryName);
		int i = query.executeUpdate();
		if(i==0) {
			System.out.println("not updated");
		}
		else {
			System.out.println("Updated");
		}

	}

	@Override
	public void updatePopulationByCountryId(int countryPopulation,int countryId) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<Country> query = session.createQuery("update Country set countryPopulation=:countryPopulation where countryId=:countryId");
		query.setParameter("countryPopulation", countryPopulation);
		query.setParameter("countryId", countryId);
		int i = query.executeUpdate();
		if(i==0) {
			System.out.println("not updated");
		}
		else {
			System.out.println("Updated");
		}
	}
	@Override
	public State findStateById(int stateId) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		State state = session.get(State.class, stateId);
		transaction.commit();
		session.close();
		return state;

	}
	@Override
	public State findStateByName(String stateName) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Query<State> query = session.createQuery("from State where stateName=:stateName");
		query.setParameter("stateName", stateName);
		State name = query.getSingleResult();
		transaction.commit();
		session.close();
		return name;
	}
	@Override
	public State findStateByCheifMinister(String stateCheifMinister) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Query<State> query = session.createQuery("from State where stateCheifMinister=:stateCheifMinister");
		query.setParameter("stateCheifMinister", stateCheifMinister);
		State result = query.getSingleResult();
		transaction.commit();
		session.close();
		return result;

	}
	@Override
	public List<State> findStatesByCountryId(int countryId) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Country country = session.get(Country.class, countryId);
		Query<State> query = session.createQuery("from State where country_countryId=(from Country where countryId=:countryId)",State.class);
		query.setParameter("countryId", countryId);
		List<State> list = query.getResultList();
		transaction.commit();
		session.close();
		return list;
	}
	@Override
	public List<State> findStatesBycountryName(int countryId,String countryName) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Country country = session.get(Country.class, countryId);
		Query<State> query = session.createQuery("from State where country_countryId=(from Country where countryId=:countryId and countryName=(from Country where countryName=:countryName))",State.class);
		query.setParameter("countryId", countryId);
		query.setParameter("countryName", countryName);
		List<State> list = query.getResultList();
		return list;
	}
	@Override
	public void updateStatePopulationByName(int statePopulation,String stateName) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<State> query = session.createQuery("update State set statePopulation=:statePopulation where stateName=:stateName");
		query.setParameter("statePopulation",statePopulation);
		query.setParameter("stateName", stateName);
		int i = query.executeUpdate();
		if(i==0) {
			System.out.println("not updated");
		}
		else {
			System.out.println("Updated");
		}
		trans.commit();
		session.close();
	}
	@Override
	public void deleteStateByName(String stateName) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Query<State> query = session.createQuery("delete State where stateName=:stateName");
		query.setParameter("stateName", stateName);
		State state =(State)query.getSingleResult();
		int i = query.executeUpdate();
		if(i==0) {
			System.out.println("not deleted");
		}
		else {
			System.out.println("deleted");
		}
		trans.commit();
		session.close();
	}
	@Override
	public void deleteAllStatesBYCountryId(int countryId) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		Country country = session.get(Country.class, countryId);
		List<State> list = country.getL();
		for(State s : list) {
			session.delete(s);
		}

	}

}
