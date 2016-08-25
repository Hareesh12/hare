package com.myproject.bikeride.controller.admin;

import com.myproject.bikeride.model.Customer;
import com.myproject.bikeride.model.Product;
import com.myproject.bikeride.service.CustomerService;
import com.myproject.bikeride.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/adminhome")
public class AdminPage {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String adminPage(){
        return "adminhome";
    }

    @RequestMapping("/productinventory")
    public String productInventory(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productinventory";
    }

    @RequestMapping("/customer")
    public String customerManagerment(Model model){

        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList", customerList);

        return "usermanagement";
    }


} // The End of Class;
