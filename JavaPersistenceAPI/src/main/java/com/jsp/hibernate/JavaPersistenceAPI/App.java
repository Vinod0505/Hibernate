package com.jsp.hibernate.JavaPersistenceAPI;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Car car = new Car();
    	car.setCarId(102);
    	car.setCarName("Audi");
    	car.setCarPrice(40000000);
    	
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinod");
       EntityManager em = emf.createEntityManager();
       EntityTransaction et = em.getTransaction();
       et.begin();
       
//       em.persist(car);
       
     Car car2 = em.find(Car.class, 101);
     
     System.out.println(car2);
     
       et.commit();
       
       em.close();
       
    }
}
