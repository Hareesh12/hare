package com.niit.showbikes.dao;

import java.util.List;

import com.niit.showbikes.model.ProductsModel;

public interface ProductDAO {
	public void save(ProductsModel c);
	void update(ProductsModel p);

	public List<ProductsModel> getProductList();

	void remove(Integer pid);

}
