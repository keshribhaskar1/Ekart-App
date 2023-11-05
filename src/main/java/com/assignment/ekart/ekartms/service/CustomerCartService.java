package com.assignment.ekart.ekartms.service;

import com.assignment.ekart.ekartms.entity.CartProductEntity;
import com.assignment.ekart.ekartms.model.CartProduct;
import com.assignment.ekart.ekartms.model.CustomerCart;

import java.util.Set;

public interface CustomerCartService {
    String addProductToCart(CustomerCart customerCart) throws Exception;
    CustomerCart getProductsFromCart(String customerEmailId) throws Exception;
    String deleteProductFromCart(String customerEmailId) throws Exception;
}
