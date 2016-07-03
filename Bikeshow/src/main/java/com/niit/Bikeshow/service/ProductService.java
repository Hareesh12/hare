package com.niit.Bikeshow.service;
import java.util.List;
import com.niit.Bikeshow.Model.ProductModel;

public interface ProductService {
	public void insertProductModel(ProductModel u);
	List<ProductModel> getProductList();
}
