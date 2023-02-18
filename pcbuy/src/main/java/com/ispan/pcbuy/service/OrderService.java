package com.ispan.pcbuy.service;

import com.ispan.pcbuy.dto.CreateCartRequest;
import com.ispan.pcbuy.dto.CreateOrderRequest;
import com.ispan.pcbuy.model.Cart;
import com.ispan.pcbuy.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    void createCart(Integer userId, CreateCartRequest createCartRequest);

    List<Cart> getCart(Integer userId);

    void clearCart(Integer userId);
}
