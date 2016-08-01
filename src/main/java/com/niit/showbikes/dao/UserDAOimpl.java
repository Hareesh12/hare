package com.niit.showbikes.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.showbikes.model.UserDetails;

@Service
public class UserDAOimpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser( UserDetails ud)
	{
		Session s=this.sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(ud);
		t.commit();
		
	}
	
	
	  
    @Transactional
	public boolean isValidUser(String un, String pd ) {
    	System.out.println(un);
    	String hql = "from UserDetails where username= '" + un + "' and " + " password ='" + pd + "'";
		System.out.println(hql);
    	Query query = sessionFactory.openSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<UserDetails> list =(List<UserDetails>) query.list();
		//System.out.prin);
	if(list !=null && !list.isEmpty())
	{
		System.out.println("\nlogin ok");
		return true;
	}
	else
	{
		System.out.println("\nlogin not ok");
		return false;
	}
    }
	

    @Transactional
	public boolean isAdmin(String name, String password ) {
    	
    	String hql = "from UserDetails where username= '" + name + "' and " + " password ='" + password + "' and isadmin='true'";
		System.out.println(hql);
    	Query query = sessionFactory.openSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<UserDetails> list =(List<UserDetails>) query.list();
		//System.out.prin);
	if(list !=null && !list.isEmpty())
	{
		System.out.println("\nadmin ok");
		return true;
	}
	else
	{
		System.out.println("\nadmin not ok");
		return false;
	}
	
	
	}

}
