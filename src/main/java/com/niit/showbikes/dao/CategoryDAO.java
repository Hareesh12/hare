package com.niit.showbikes.dao;

import java.util.List;

import com.niit.showbikes.model.*;

public interface CategoryDAO {
	public void save(CategoriesModel c);
	public List<CategoriesModel> getCategoryList();
	void update(CategoriesModel p);

	void remove(Integer pid);
}
