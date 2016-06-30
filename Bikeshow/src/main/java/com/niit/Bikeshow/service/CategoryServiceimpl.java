package com.niit.Bikeshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Bikeshow.dao.CategoryDAO;
import com.niit.Bikeshow.Model.CategoryModel;

@Service
public class CategoryServiceimpl implements CategoryService {
	@Autowired
	CategoryDAO categoryDAO;
	public void insertCategoryModel(CategoryModel u)
	{
		categoryDAO.insertCategoryModel(u);
	}

}
