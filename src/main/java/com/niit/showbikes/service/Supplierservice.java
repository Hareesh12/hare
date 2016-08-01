package com.niit.showbikes.service;

import java.util.List;

import com.niit.showbikes.model.SupplierModel;

public interface Supplierservice {
	public void insertSupplierModel(SupplierModel u);
	List<SupplierModel> getSupplierList();
	void update(SupplierModel s);
	void remove(Integer sid);

}
