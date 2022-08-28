package com.springboot.springboot.service;

import com.springboot.springboot.payload.OrderRequest;
import com.springboot.springboot.payload.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
