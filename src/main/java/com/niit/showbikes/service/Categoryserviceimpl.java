package com.niit.showbikes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.showbikes.dao.CategoryDAO;
import com.niit.showbikes.model.*;

@Service
public class Categoryserviceimpl implements Categoryservice{
@Autowired
CategoryDAO categoryDAO;
	
	
	
	public List<CategoriesModel> getCategoryList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<CategoriesModel> a= categoryDAO.getCategoryList();
		System.out.println(a);
		return a;
	}
	public void update(CategoriesModel p) {
		// TODO Auto-generated method stub
		categoryDAO.update(p);
		
	}
	public void remove(Integer pid) {
		// TODO Auto-generated method stub
		categoryDAO.remove(pid);
	}
	
}

