package com.niit.showbikes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.showbikes.dao.UserDAO;
import com.niit.showbikes.model.CategoriesModel;
import com.niit.showbikes.model.ProductsModel;
import com.niit.showbikes.model.SupplierModel;
import com.niit.showbikes.model.UserDetails;
import com.niit.showbikes.service.Categoryservice;
import com.niit.showbikes.service.Productservice;
import com.niit.showbikes.service.Supplierservice;
import com.niit.showbikes.service.Userservice;

@Controller
public class HomeController {

	@Autowired
	Categoryservice cs;
	@Autowired
	Supplierservice ss;
	@Autowired
	Productservice ps;
	@Autowired
	Userservice us;
	@SuppressWarnings("unused")
	@Autowired   
    private SessionFactory  sessionFactory;
	@Autowired
	UserDAO userDAO;
	@RequestMapping("/")
	public ModelAndView getHomePage() {	
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup() {
        //us.insertSignupModel(sm);
		
		return new ModelAndView("signup","command",new UserDetails());
	}
	@RequestMapping("/login")
	public ModelAndView login() {

		
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}

	@RequestMapping("/adminhome")
	public ModelAndView adminhome(){
	ModelAndView mv= new ModelAndView("adminhome");
	return mv;
}
	
	@RequestMapping("error")
	public ModelAndView ErrorPage() {	
		ModelAndView mv=new ModelAndView("error");
		return mv;
	}
	@RequestMapping("denied")
	public ModelAndView accessdenied() {	
		ModelAndView mv=new ModelAndView("denied");
		return mv;
	}
	@RequestMapping("userhome")
	public ModelAndView userhome() {	
		ModelAndView mv=new ModelAndView("userhome");
		return mv;
	}
	
	@RequestMapping("/userproductlist")
	public ModelAndView userproductlist() {

		
		ModelAndView mv=new ModelAndView("userproductlist");
		return mv;
	}
	@RequestMapping("/usersupplierlist")
	public ModelAndView usersupplierlist() {

		
		ModelAndView mv=new ModelAndView("usersupplierlist");
		return mv;
	}
	@RequestMapping("/usercatgeorylist")
	public ModelAndView usercategorylist() {

		
		ModelAndView mv=new ModelAndView("usercategorylist");
		return mv;
	}
	
	@RequestMapping("/userproduct")
	public ModelAndView userproduct()
	{
		List<ProductsModel> arr=ps.getProductList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("userproductlist","data",gson.toJson(arr));
	}

	@RequestMapping("/usersupplier")
	public ModelAndView viewsuppliers()
	{
		List<SupplierModel> arr=ss.getSupplierList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("usersupplierlist","data",gson.toJson(arr));
	}
	
	@RequestMapping("/usercategory")
	public ModelAndView viewcategories()
	{
		List<CategoriesModel> arr=cs.getCategoryList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("usercategorylist","data",gson.toJson(arr));
	}
	
	@RequestMapping("/addcustomer")
	public ModelAndView registeruser(@ModelAttribute UserDetails userDetails){
       userDAO.addUser(userDetails);		
	return new ModelAndView("login");
	
	}
	
	 @RequestMapping("/isValidUser")
		public ModelAndView showMessage(@RequestParam(value="username")String name,@RequestParam(value = "password") String password)
		{
			System.out.println("in controller");
				String message;
		ModelAndView mv;
			if (userDAO.isValidUser(name, password)==true)
			{
				if(userDAO.isAdmin(name,password)==true)
				    {
			        mv= new ModelAndView("adminhome");	
			        mv.addObject("message","Hi"+name );
			        }
		         else
				    { 
		        	 mv =new ModelAndView("userhome"); 
		        	 mv.addObject("message",name );
		        	 
		        	 }
	        }
		else 
		   {
			 mv = new ModelAndView("error");
			 mv.addObject("message", "Login Failed");
			}
			
			return mv;
		}
	 @SuppressWarnings("unused")
	private String getPrincipal(){
			String userName = null;
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

			if (principal instanceof UserDetails) {
				userName = ((UserDetails)principal).getUsername();
			} else {
				userName = principal.toString();
			}
			return userName;
		}


	/**
	 * security implementation code
	 * @param model
	 * @return
	 *//*

	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		model.addAttribute("greeting", "Hi, Welcome to mysite");
		return "index";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "adminhome";
	}

	

	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "denied";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
    @RequestParam(value = "logout", required = false) String logout) {
         
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid Credentials provided.");
        }
 
        if (logout != null) {
            model.addObject("message", "Logged out from application successfully.");
        }
 
        model.setViewName("login");
        return model;
    }
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

	private String getPrincipal(){
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails)principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	*//**
	 * 
	 */
}

