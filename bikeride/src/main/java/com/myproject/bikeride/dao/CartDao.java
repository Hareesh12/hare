package com.myproject.bikeride.dao;


import java.io.IOException;

import com.myproject.bikeride.model.Cart;

public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);

}

