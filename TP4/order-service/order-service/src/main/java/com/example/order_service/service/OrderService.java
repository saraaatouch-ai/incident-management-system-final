package com.example.order_service.service;

import com.example.order_service.DTO.OrderRequest;
import com.example.order_service.model.Order;

public interface OrderService {
    Order saveOrder(OrderRequest orderRequest);
}