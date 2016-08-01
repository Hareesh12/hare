package com.niit.showbikes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.showbikes.dao.CategoryDAO;
import com.niit.showbikes.model.CategoriesModel;
import com.niit.showbikes.service.Categoryservice;


@Controller
public class CategoryController {
	@Autowired 
	CategoryDAO categoryDAO;
	@Autowired
	Categoryservice cs;

	  @Autowired
	    private SessionFactory sf;
	@RequestMapping("/categories")
	public ModelAndView categories() {

		
		ModelAndView mv=new ModelAndView("addcategory","command",new CategoriesModel());
		return mv;
	}
	
	
	@RequestMapping("/viewcategory")
	public ModelAndView viewcategories()
	{
		List<CategoriesModel> arr=cs.getCategoryList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("categorylist","data",gson.toJson(arr));
	}

	
	
	@RequestMapping("addcategory")
	public ModelAndView addcategory(@ModelAttribute("CategoriesModel") CategoriesModel c)  {
	
		categoryDAO.save(c);
		ModelAndView mv=new ModelAndView("redirect:/viewcategory");
		String message;
		mv.addObject("message", "category added");
	
		return mv;
	}
		
		int c;
		@RequestMapping("/edit/{id}")
		public ModelAndView edit(@PathVariable("id")int sid,HttpServletRequest req) 
		 {
			System.out.println("in controller1");
			c=sid;
			System.out.println("in controller2");
			CategoriesModel p=new CategoriesModel();			
			System.out.println("in controller3");
			Session s=sf.openSession();
			CategoriesModel p1=(CategoriesModel)s.get(CategoriesModel.class,c);
			System.out.println("haiiiiii");
			System.out.println("p1.getcategoryname()"+p1.getName());
			ModelAndView m1 = new ModelAndView("updatecategory");HttpSession sess=req.getSession();
			sess.setAttribute("data1",p1);
			m1.addObject("command", p1);
			System.out.println(p1.getName());
			m1.addObject("data", p1);		 
			return m1;
			}
		@RequestMapping("/edit/updatecategory")
		public ModelAndView update(@ModelAttribute CategoriesModel p) 
		 {
			cs.update(p);
			return new ModelAndView("redirect:/viewcategory");  
		 }
		
		@RequestMapping("/delete/{id}")
		 public ModelAndView deletecategory(@PathVariable("id")int id) 
		 {
			System.out.println("in delete");
			cs.remove(id);
			return new ModelAndView("redirect:/viewcategory");  
		 }
		
		
}
		
	


