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
import com.niit.showbikes.model.SupplierModel;
import com.niit.showbikes.service.Supplierservice;


@Controller
public class SupplierController {
	@Autowired
	Supplierservice ss;
	  @Autowired
	    private SessionFactory sf;

	@RequestMapping("/suppliers")
	public ModelAndView suppliers() {

		
		ModelAndView mv=new ModelAndView("addsupplier","command",new SupplierModel());
		return mv;
	}
	@RequestMapping("/addsupplier")
	public ModelAndView addSupplier(@ModelAttribute("SupplierModel") SupplierModel c ) {
	System.out.println("in add supplier");
        ss.insertSupplierModel(c);
		
		ModelAndView mv=new ModelAndView("supplier","command",new SupplierModel());
		return new ModelAndView("redirect:/viewsupplier");  
	}
	@RequestMapping("/viewsupplier")
	public ModelAndView viewsuppliers()
	{
		List<SupplierModel> arr=ss.getSupplierList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("supplierlist","data",gson.toJson(arr));
	}
	
	int b;
	@RequestMapping("/Edit/{Supplierid}")
	public ModelAndView editing(@PathVariable("Supplierid")int sid,HttpServletRequest req) 
	 {
		System.out.println("in controller1");
		b=sid;
		System.out.println("in controller2");
		SupplierModel p=new SupplierModel();			
		System.out.println("in controller3");
		Session s=sf.openSession();
		SupplierModel p1=(SupplierModel)s.get(SupplierModel.class,b);
		System.out.println("haiiiiii");
		System.out.println("p1.getSuppliername()"+p1.getSuppliername());
		ModelAndView m1 = new ModelAndView("updatesupplier");HttpSession sess=req.getSession();
		sess.setAttribute("data1",p1);
		m1.addObject("command", p1);
		System.out.println(p1.getSuppliername());
		m1.addObject("data", p1);		 
		return m1;
		}

	@RequestMapping("Edit/updatesupplier")
	public ModelAndView update(@ModelAttribute("ekart")SupplierModel p) 
	 {
		ss.update(p);
		return new ModelAndView("redirect:/viewsupplier");  
	 }
	@RequestMapping("/Delete/{Supplierid}")
	 public ModelAndView deletesupplier(@PathVariable("Supplierid")int id) 
	 {
		ss.remove(id);
		return new ModelAndView("redirect:/viewsupplier");  
	 }
	
	
}
