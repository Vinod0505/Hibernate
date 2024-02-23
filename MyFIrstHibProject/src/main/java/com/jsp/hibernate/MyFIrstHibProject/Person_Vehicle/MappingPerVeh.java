package com.jsp.hibernate.MyFIrstHibProject.Person_Vehicle;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingPerVeh {
	public static void main(String[] args) {

		PersonMapping p1 = new PersonMapping();
		p1.setPersonId(201);
		p1.setPersonName("John");


		VehicleMapping v1 = new VehicleMapping();
		v1.setVehicleId(1001);
		v1.setVehicleName("Car");
		v1.setVehiclePrice(3.2);
		v1.setPersonmapping(p1);


		VehicleMapping v2 = new VehicleMapping();
		v2.setVehicleId(1002);
		v2.setVehicleName("Bike");
		v2.setVehiclePrice(1.5);
		v2.setPersonmapping(p1);


		VehicleMapping v3 = new VehicleMapping();
		v3.setVehicleId(1003);
		v3.setVehicleName("Lorry");
		v3.setVehiclePrice(8.9);
		v3.setPersonmapping(p1);

		p1.setVehList(Arrays.asList(v1,v2,v3));

		SessionFactory sf = new Configuration().configure()
				.addAnnotatedClass(PersonMapping.class).addAnnotatedClass(VehicleMapping.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(p1);
		session.save(v1);
		session.save(v2);
		session.save(v3);

		trans.commit();
		session.close();
	}
}
