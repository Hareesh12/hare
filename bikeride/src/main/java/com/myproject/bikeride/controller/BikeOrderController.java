package com.myproject.bikeride.controller;

import com.myproject.bikeride.model.Cart;
import com.myproject.bikeride.model.Customer;
import com.myproject.bikeride.model.CustomerOrder;
import com.myproject.bikeride.service.CartService;
import com.myproject.bikeride.service.CustomerOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BikeOrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId){
        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart = cartService.getCartById(cartId);
        customerOrder.setCart(cart);

        Customer customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        customerOrder.setInvoiceAddress(customer.getInvoiceAddress());
        customer.setDeliveryAddress(customer.getDeliveryAddress());

        customerOrderService.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId=" + cartId;

    }

} // The End of Class;
