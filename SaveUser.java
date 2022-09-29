package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {

	public static void main(String[] args) {
        User user=new User();
        user.setName("Lakshmi");
        user.setEmail("LM@gmail.com");
        user.setPassword("abc");
        user.setPhone(9108322820l);
        
        User user2=new User();
        user2.setName("Vinay");
        user2.setEmail("VM@gmail.com");
        user2.setPassword("xyz");
        user2.setPhone(886733813l);
        
        Cab cab=new Cab();
        cab.setId(3);
        cab.setName("maruti-car");
        cab.setNumber("145sbd3hh");
        
        
        Cab cab1=new Cab();
        cab1.setId(4);
        cab1.setName("Audi-car");
        cab1.setNumber("abc458rte");
        
		/*
		 * List<Cab> l=new ArrayList(); l.add(cab); l.add(cab1);
		 * 
		 * user.setCab(l);
		 */
        
        List<User> l2=new ArrayList();
        l2.add(user);
        l2.add(user2);
        
        cab.setUser(l2);
        
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        entityTransaction.begin();
        entityManager.persist(user);
        entityManager.persist(user2);
        entityManager.persist(cab);
        entityManager.persist(cab1);
        entityTransaction.commit();
        
	}

}
