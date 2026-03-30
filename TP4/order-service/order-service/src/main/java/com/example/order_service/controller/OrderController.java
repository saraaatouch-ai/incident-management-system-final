package com.example.order_service.controller;

import com.example.order_service.DTO.OrderRequest;
import com.example.order_service.model.Order;
import com.example.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.saveOrder(orderRequest);
    }
}
