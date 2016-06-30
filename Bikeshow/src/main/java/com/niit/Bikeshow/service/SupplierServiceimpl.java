package com.niit.Bikeshow.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.niit.Bikeshow.dao.SupplierDAO;
import com.niit.Bikeshow.Model.SupplierModel;

@Service
public class SupplierServiceimpl implements SupplierService {
	@Autowired
	SupplierDAO supplierDAO;
	public void insertSupplierModel(SupplierModel u)
	{
		supplierDAO.insertSupplierModel(u);
	}

}
