package com.lti.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.lti.model.Admin;
import com.lti.model.User;

public class AdminDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	  public AdminDao()  {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	public void addAAdmin(Admin admin) {
		tx.begin();
		em.merge(admin);
		tx.commit();
		System.out.println("new admin added.");
	}
	public boolean loginAdmin(long adminId,String password) {
		String jpql="select a from Admin a where a.adminId=:uid and a.password=:psw";
		Query query=em.createQuery(jpql,User.class);
		query.setParameter("uid",adminId);
		query.setParameter("psw",password);
		if(query.getFirstResult()>0)
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}
	public Admin findAdminById(int adminId) {
		return em.find(Admin.class, adminId);
	}
}
