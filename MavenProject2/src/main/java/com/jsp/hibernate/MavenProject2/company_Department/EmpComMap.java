package com.jsp.hibernate.MavenProject2.company_Department;

import java.util.Arrays; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpComMap {
	public static void main(String[] args) {


		Employee e1 = new Employee();
		e1.setEmployeeId(100);
		e1.setEmployeeName("Smith");
		e1.setEmployeeSalary(3000);

		Employee e2 = new Employee();
		e2.setEmployeeId(101);
		e2.setEmployeeName("John");
		e2.setEmployeeSalary(7000);

		Employee e3 = new Employee();
		e3.setEmployeeId(102);
		e3.setEmployeeName("Alex");
		e3.setEmployeeSalary(2000);

		Employee e4 = new Employee();
		e4.setEmployeeId(103);
		e4.setEmployeeName("Danny");
		e4.setEmployeeSalary(5800);


		Employee e5 = new Employee();
		e5.setEmployeeId(104);
		e5.setEmployeeName("James");
		e5.setEmployeeSalary(4300);

		Employee e6 = new Employee();
		e6.setEmployeeId(105);
		e6.setEmployeeName("Raju");
		e6.setEmployeeSalary(3800);


		Employee e7 = new Employee();
		e7.setEmployeeId(106);
		e7.setEmployeeName("Sam");
		e7.setEmployeeSalary(2600);

		Employee e8 = new Employee();
		e8.setEmployeeId(107);
		e8.setEmployeeName("Jone");
		e8.setEmployeeSalary(9600);

		Employee e9 = new Employee();
		e9.setEmployeeId(108);
		e9.setEmployeeName("Adams");
		e9.setEmployeeSalary(6700);

		Employee e10 = new Employee();
		e10.setEmployeeId(109);
		e10.setEmployeeName("Allen");
		e10.setEmployeeSalary(8400);

		Employee e11 = new Employee();
		e11.setEmployeeId(110);
		e11.setEmployeeName("Cathrein");
		e11.setEmployeeSalary(4600);

		Employee e12 = new Employee();
		e12.setEmployeeId(111);
		e12.setEmployeeName("Messi");
		e12.setEmployeeSalary(9900);

		Department d1 = new Department();
		d1.setDepartmentId(10);
		d1.setDepartmentName("Manager");
		d1.setDepartmentLocation("London");
		d1.seteList(Arrays.asList(e1,e7,e9));

		Department d2 = new Department();
		d2.setDepartmentId(20);
		d2.setDepartmentName("HR");
		d2.setDepartmentLocation("USA");
		d2.seteList(Arrays.asList(e2,e5,e8));

		Department d3 = new Department();
		d3.setDepartmentId(30);
		d3.setDepartmentName("Rsearch");
		d3.setDepartmentLocation("Dallas");
		d3.seteList(Arrays.asList(e3,e6,e11));

		Department d4 = new Department();
		d4.setDepartmentId(40);
		d4.setDepartmentName("TeamLead");
		d4.setDepartmentLocation("Bengaluru");
		d4.seteList(Arrays.asList(e4,e12,e10));

		Company company = new Company();
		company.setCompanyId(1001);
		company.setCompanyName("IBM");
		company.setEmpList(Arrays.asList(e1,e2,e3,e4));
		company.setDepList(Arrays.asList(d1,d2,d3,d4));

		Company company2= new Company();
		company2.setCompanyId(1002);
		company2.setCompanyName("TechMahindra");
		company2.setEmpList(Arrays.asList(e5,e6,e7,e8));
		company.setDepList(Arrays.asList(d1,d2,d3,d4));

		Company company3= new Company();
		company3.setCompanyId(1003);
		company3.setCompanyName("MindTree");
		company3.setEmpList(Arrays.asList(e9,e10,e11,e12));
		company.setDepList(Arrays.asList(d1,d2,d3,d4));


		//hibernate


		SessionFactory	sf = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Company.class).addAnnotatedClass(Department.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(e6);
		session.save(e7);
		session.save(e8);
		session.save(e9);
		session.save(e10);
		session.save(e11);
		session.save(e12);
		session.save(company);
		session.save(company2);
		session.save(company3);
		session.save(d1);
		session.save(d2);
		session.save(d3);
		session.save(d4);

		trans.commit();
		session.close();
	}
}

