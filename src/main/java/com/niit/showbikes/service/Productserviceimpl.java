package com.niit.showbikes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.showbikes.dao.ProductDAO;
import com.niit.showbikes.model.CategoriesModel;
import com.niit.showbikes.model.ProductsModel;
@Service
public class Productserviceimpl implements Productservice{
	@Autowired
	ProductDAO productDAO;
	
	public void update(ProductsModel p) {
		// TODO Auto-generated method stub
		productDAO.update(p);
		
	}
	public void remove(Integer pid) {
		// TODO Auto-generated method stub
		productDAO.remove(pid);
	}

	public List<ProductsModel> getProductList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<ProductsModel> a=productDAO.getProductList();
		System.out.println(a);
		return a;
	
	}
}
