package com.niit.Bikeshow.dao;
import com.niit.Bikeshow.Model.ProductModel;

import java.util.List;

public interface ProductDAO {
	public void insertProductModel(ProductModel u);
	public List<ProductModel> getProductList();

}
