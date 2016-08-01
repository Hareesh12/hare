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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.showbikes.dao.ProductDAO;
import com.niit.showbikes.model.CategoriesModel;
import com.niit.showbikes.model.ProductsModel;
import com.niit.showbikes.model.SupplierModel;
import com.niit.showbikes.service.Productservice;
@Controller
public class ProductController {

	@Autowired
	Productservice pm;
	
	  @Autowired
		Productservice ps;
	  @Autowired
	    private SessionFactory sf;
	  @Autowired
	  private ProductDAO productDAO;
	  String message;
	
	  @RequestMapping("/products")
	  public ModelAndView addproduct()
	  {
		  ModelAndView mv=new ModelAndView("addproduct","command",new ProductsModel());
			return mv;
	  }
	
	  @RequestMapping("/viewproduct")
		public ModelAndView viewproduct()
		{
			List<ProductsModel> arr=ps.getProductList();
			Gson gson=new Gson();
			String json=gson.toJson(arr);
			return new ModelAndView("productlist","data",gson.toJson(arr));
		}
	  
	  
	  
	  
	  
	@RequestMapping("/addproduct")
	public ModelAndView addproduct(@ModelAttribute("ProductsModel") ProductsModel c)  {
		
		productDAO.save(c);
		ModelAndView mv=new ModelAndView("redirect:/viewproduct");
		mv.addObject("message", "Product Added");
		
	
		return mv;
	}
	
	
	int c;
	@RequestMapping("/edits/{Productid}")
	public ModelAndView edit(@PathVariable("Productid")int sid,HttpServletRequest req) 
	 {
		System.out.println("in controller1");
		c=sid;
		System.out.println("in controller2");
		ProductsModel p=new ProductsModel();			
		System.out.println("in controller3");
		Session s=sf.openSession();
		ProductsModel p1=(ProductsModel)s.get(ProductsModel.class,c);
		System.out.println("haiiiiii");
		System.out.println("p1.getProductsname()"+p1.getProductName());
		ModelAndView m1 = new ModelAndView("updateproduct");HttpSession sess=req.getSession();
		sess.setAttribute("data1",p1);
		m1.addObject("command", p1);
		System.out.println(p1.getProductName());
		m1.addObject("data", p1);		 
		return m1;
		}
	@RequestMapping("/edits/updateproduct")
	public ModelAndView update(@ModelAttribute ProductsModel p) 
	 {
		ps.update(p);
		return new ModelAndView("redirect:/viewproduct");  
	 }
	
	@RequestMapping("/deletes/{Productid}")
	 public ModelAndView deletecategory(@PathVariable("Productid")int id) 
	 {
		System.out.println("in delete");
		ps.remove(id);
		return new ModelAndView("redirect:/viewproduct");  
	 }
	
	
	
}
