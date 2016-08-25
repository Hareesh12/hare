package com.myproject.bikeride.dao;


import com.myproject.bikeride.model.Cart;
import com.myproject.bikeride.model.CartItem;

public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
