package com.niit.showbikes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.showbikes.dao.SupplierDAO;
import com.niit.showbikes.model.ProductsModel;
import com.niit.showbikes.model.SupplierModel;

@Service
public class Supplierserviceimpl implements Supplierservice{
	@Autowired
	SupplierDAO SupplierDAO;
	public void insertSupplierModel(SupplierModel u)
	{
		SupplierDAO.insertSupplierModel(u);
	}
	public List<SupplierModel> getSupplierList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<SupplierModel> a= SupplierDAO.getSupplierList();
		System.out.println(a);
		return a;
	}
	public void update(SupplierModel s) {
		// TODO Auto-generated method stub
		SupplierDAO.update(s);
		
	}
	public void remove(Integer sid) {
		// TODO Auto-generated method stub
		SupplierDAO.remove(sid);
		
	}
}
