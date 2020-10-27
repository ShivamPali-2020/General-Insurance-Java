package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Address;
import com.lti.model.BuyInsurance;
import com.lti.model.PolicyCategory;
import com.lti.model.Status;
import com.lti.model.User;
import com.lti.model.Vehicle;

public class UserDao {
	public void addAUser(User user) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");  
		EntityManager em=emf.createEntityManager(); 
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.merge(user);
		tx.commit();
		System.out.println("user registered.");
	}
	public User findAUserByuserId(long userId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu"); 
		EntityManager em=emf.createEntityManager(); 
		EntityTransaction tx=em.getTransaction();
		return em.find(User.class, userId);	
	}
	
	public User loginUser(long userId,String pass) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");  
		EntityManager em=emf.createEntityManager(); 
		EntityTransaction tx=em.getTransaction();
		String jpql="select u from User u where u.userId=:uid and u.password=:psw";
		Query query=em.createQuery(jpql,User.class);
		query.setParameter("uid",userId);
		query.setParameter("psw",pass);
		User user=(User)query.getResultList().stream().findFirst().orElse(null);
		if(user!=null)
			return user;
		return null;
	}
	public void addAUserWithAAddress(User user) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu"); 
		EntityManager em=emf.createEntityManager(); 
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.merge(user);
		tx.commit();
	}
	public void buyInsuranceforAVehicle(Vehicle vehicle) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu"); 
		EntityManager em=emf.createEntityManager(); 
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.merge(vehicle);
		tx.commit();
	}

}
