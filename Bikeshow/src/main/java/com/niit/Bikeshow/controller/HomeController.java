package com.niit.Bikeshow.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Bikeshow.Model.CategoryModel;
import com.niit.Bikeshow.Model.SignupModel;
import com.niit.Bikeshow.Model.SupplierModel;
import com.niit.Bikeshow.service.UserService;


@Controller
public class HomeController {
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public ModelAndView getHomePage() {

	
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signup() {
        //us.insertSignupModel(sm);
		
		return new ModelAndView("signup","command",new SignupModel());
	}
	@RequestMapping("/addcustomer")
		public ModelAndView addCustomer(@ModelAttribute("SignupModel") SignupModel sm ) {
		System.out.println("in add customer");
            us.insertSignupModel(sm);
			
			ModelAndView mv=new ModelAndView("signup","command",new SignupModel());
			return mv;
		}

		
	@RequestMapping("/login")
	public ModelAndView login() {

		
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/customercare")
	public ModelAndView customercare() {

		
		ModelAndView mv=new ModelAndView("customercare");
		return mv;
	}
	@RequestMapping("/category")
	public ModelAndView category() {

		return new ModelAndView("category","command",new CategoryModel());
	}
	@RequestMapping("/addcategory")
	public ModelAndView addCategory(@ModelAttribute("CategoryModel") CategoryModel cm ) {
	System.out.println("in add category");
       //cs.insertCategoryModel(cm);		
		ModelAndView mv=new ModelAndView("category","command",new CategoryModel());
		return mv;
	}
	@RequestMapping("/supplier")
	public ModelAndView supplier() {

		return new ModelAndView("supplier","command",new SupplierModel());
	}
	@RequestMapping("/addsupplier")
	public ModelAndView addSupplier(@ModelAttribute("SupplierModel") SupplierModel sm ) {
	System.out.println("in add supplier");
       //ss.insertSupplierModel(sm);		
		ModelAndView mv=new ModelAndView("supplier","command",new SupplierModel());
		return mv;
	}

	@RequestMapping("/adminhome")
	public ModelAndView adminhome() {

		
		ModelAndView mv=new ModelAndView("adminhome");
		return mv;
	}
}