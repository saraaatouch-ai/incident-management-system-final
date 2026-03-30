package com.example.order_service.service;

import com.example.order_service.DTO.OrderRequest;
import com.example.order_service.Feign_Client.ProductClient;
import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ProductClient productClient;

    @Override
    public Order saveOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setProductId(orderRequest.getProductId());
        order.setQuantity(orderRequest.getQuantity());
        productClient.updateStock(orderRequest.getProductId(), orderRequest.getQuantity());

        return orderRepository.save(order);
    }
}