package com.niit.showbikes.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.showbikes.model.CategoriesModel;



@Service
public class CategoryDAOimpl  implements CategoryDAO{

@Autowired
private SessionFactory sessionFactory;
	
	   @SuppressWarnings("unchecked")
		@Transactional(propagation=Propagation.SUPPORTS)
	    
		public List<CategoriesModel> getCategoryList()
		{
			System.out.println("-----------  "+sessionFactory);
			Session s=sessionFactory.openSession();
			Transaction t = s.beginTransaction();
			System.out.println("In dao ");
			List<CategoriesModel> al=new ArrayList<CategoriesModel>();
					 al=s.createQuery("from CategoriesModel").list();
			 t.commit();
			 return al;
		}  

@Transactional
public void save(CategoriesModel c){
	Session s=this.sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	s.save(c);
	t.commit();
}

public void update(CategoriesModel p){
	System.out.println("In update category");
	Session s=sessionFactory.openSession();
	Transaction t = s.beginTransaction();
	CategoriesModel p1=(CategoriesModel)s.load(CategoriesModel.class,p.getId());
	if(p1!=null)
	{
		System.out.println("****inif");
		s.update(p);
	}
	t.commit();
	}

@Transactional
public void remove(Integer pid)
{
	System.out.println("in category delete");

	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	CategoriesModel p=(CategoriesModel)s.load(CategoriesModel.class,new Integer(pid));
	if(p!=null)
	{
		s.delete(p);
	}
	t.commit();
}

	
}
