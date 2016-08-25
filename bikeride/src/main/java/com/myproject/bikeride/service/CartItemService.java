package com.myproject.bikeride.service;


import com.myproject.bikeride.model.Cart;
import com.myproject.bikeride.model.CartItem;

public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);

}
