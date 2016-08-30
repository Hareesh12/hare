package com.niit.collaboration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView getHomePage(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
		@RequestMapping("/login")
		public ModelAndView login(){
			ModelAndView mv = new ModelAndView("login");
			return mv;
	}
		@RequestMapping("/register")
		public ModelAndView register(){
			ModelAndView mv = new ModelAndView("register");
			return mv;
		}
		@RequestMapping("/registersuccess")
		public ModelAndView registersuccess(){
			ModelAndView mv = new ModelAndView("registersuccess");
			return mv;
		}
}
