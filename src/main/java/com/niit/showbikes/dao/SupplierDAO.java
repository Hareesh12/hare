package com.niit.showbikes.dao;

import java.util.List;

import com.niit.showbikes.model.SupplierModel;

public interface SupplierDAO {
	public void insertSupplierModel(SupplierModel u);
	public List<SupplierModel> getSupplierList();
	void update(SupplierModel s);

	void remove(Integer sid);
}
