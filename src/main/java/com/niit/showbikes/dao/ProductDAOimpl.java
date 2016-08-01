package com.niit.showbikes.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.showbikes.model.ProductsModel;

@Service
public class ProductDAOimpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	List <ProductsModel> lst = new ArrayList<ProductsModel>();
	@Transactional
	public void save(ProductsModel c){
		Session s=this.sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(c);
		t.commit();
	}
	public void update(ProductsModel p){
		System.out.println("In update product");
		Session s=sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		ProductsModel p1=(ProductsModel)s.load(ProductsModel.class,p.getProductId());
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
		System.out.println("in product delete");

		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		ProductsModel p=(ProductsModel)s.load(ProductsModel.class,new Integer(pid));
		if(p!=null)
		{
			s.delete(p);
		}
		t.commit();
	}


	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<ProductsModel> getProductList()// method of ProductDAOInt defined
	{
		System.out.println("-----------  "+sessionFactory);
		Session s=sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		System.out.println("In dao ");
		List<ProductsModel> al=new ArrayList<ProductsModel>();
				 al=s.createQuery("from ProductsModel").list();
		 t.commit();
		 return al;
	}  

}
