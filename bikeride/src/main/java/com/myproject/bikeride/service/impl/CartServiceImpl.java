package com.myproject.bikeride.service.impl;


import com.myproject.bikeride.dao.CartDao;
import com.myproject.bikeride.model.Cart;
import com.myproject.bikeride.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId){
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart){
        cartDao.update(cart);
    }

} // The End of Class;
