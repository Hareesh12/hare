package com.myproject.bikeride.service;

import com.myproject.bikeride.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
