package com.springboot.springboot.payload;

import com.springboot.springboot.entity.Order;
import com.springboot.springboot.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
