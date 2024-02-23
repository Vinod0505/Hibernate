package com.jsp.hibernate.MyFIrstHibProject.employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Uday");
		e1.setEmpSal(25000);

		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Umar");
		e2.setEmpSal(30900);

		Employee e3 = new Employee();
		e3.setEmpId(103);
		e3.setEmpName("vasanth");
		e3.setEmpSal(40392);

		//anonymous invocation
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		
		//creating the first object of Configuration class
		//Configuration cfg = new Configuration();
		
		//calling configure method of Configuration class to search for the file hibernate.cfg.xml
		//cfg.configure();
		
		//for which class the hibernate to create the table  
		
		//cfg.addAnnotatedClass(Employee.class);
		
		//buildSessionFactory()  will return the SessionFactory object
		
		//SessionFactory sf = cfg.buildSessionFactory();
		
		//openSession() will return the Session object
		
		Session session = sf.openSession();
		
		//beginTransaction() allows to begin the transaction between the Session and Database
		Transaction trans= session.beginTransaction();
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		for(Employee emp : empList) {
			//save() will save the transaction of the data
			session.save(emp);
		}
		//session.save(data);

		trans.commit();
		session.close();
	}
}
