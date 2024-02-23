package com.groom.Hib_Company_db_NativeQy;

import java.util.List; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class CompanyServiceImpl implements CompanyService {

	private static SessionFactory sf;
	static {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Company.class);
		sf = cfg.buildSessionFactory();
	}
	
	@Override
	public void addCompany(Company c) {
		Session session=sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(c);
		trans.commit();
		session.close();
	}

	@Override
	public Company findCompanyById(int companyId) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Company company = session.get(Company.class, companyId);
		trans.commit();
		session.close();
		return company;
	}

	@Override
	public List<Company> findCompanyByName(String companyName) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Query<Company> query = session.createNativeQuery("select * from company where companyName=?");
		query.setParameter(1 , companyName);
		List<Company> list = query.list();
		trans.commit();
		session.close();
		return list;
	}

	@Override
	public List<Company> findCompanyByCEO(String companyCEO) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		NativeQuery<Company> query = session.createNativeQuery("select * from company where companyCEO=?");
		query.setParameter(1, companyCEO);
		List<Company> list = query.list();
		trans.commit();
		session.close();
		return list;
	}

	@Override
	public List<Company> findAllCompanyByType(String companyType) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		NativeQuery<Company> query = session.createNativeQuery("select * from company where companyType=?");
		query.setParameter(1, companyType);
		List<Company> list = query.list();
		trans.commit();
		session.close();
		return list;

	}

	@Override
	public void updateNoOfEmployeeById(int totalNoOfEmployees,int companyId) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		NativeQuery<Company> query = session.createNativeQuery("update company set totalNoOfEmployees=? where companyId=?");
		query.setParameter(1, totalNoOfEmployees);
		query.setParameter(2, companyId);
		int update = query.executeUpdate();
		if(update==0) {
			System.out.println(update+"records not updated");
		}
		trans.commit();
		session.close();
	}

	@Override
	public void updateNoOfBranchesByName(int noOfBranches,String companyName) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		NativeQuery<Company> query = session.createNativeQuery("update company set noOfBranches=? where companyName=?");
		query.setParameter(1, noOfBranches);
		query.setParameter(2, companyName);
		int update = query.executeUpdate();
		if(update==0) {
			System.out.println(update+"records not updated");
		}
		trans.commit();
		session.close();
	}

	@Override
	public void deleteCompanyByName(String companyName) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		NativeQuery<Company> query = session.createNativeQuery("delete from company where companyName=?");
		query.setParameter(1, companyName);
		int delete = query.executeUpdate();
		if(delete==0) {
			System.out.println(delete+"no records deleted");
		}
		trans.commit();
		session.close();
	}

	@Override
	public void deleteCompaniesByCompanyType(String companyType) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		NativeQuery<Company> query = session.createNativeQuery("delete from company where companyType=?");
		query.setParameter(1, companyType);
		int delete = query.executeUpdate();
		if(delete==0) {
			System.out.println(delete+"no records deleted");
		}
		trans.commit();
		session.close();

	}

}
