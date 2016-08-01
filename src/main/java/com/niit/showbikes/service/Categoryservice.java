package com.niit.showbikes.service;
import java.util.List;

import com.niit.showbikes.model.CategoriesModel;


public interface Categoryservice {
	
	List<CategoriesModel> getCategoryList();
	void update(CategoriesModel p);
	void remove(Integer pid);  

}
