package com.niit.showbikes.service;

import java.util.List;

import com.niit.showbikes.model.ProductsModel;

public interface Productservice {
	void update(ProductsModel p);
	void remove(Integer pid); 
	List<ProductsModel> getProductList();

}
