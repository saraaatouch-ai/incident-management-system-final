package com.example.order_service.Feign_Client;

import com.example.order_service.DTO.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "product-service")
public interface ProductClient {


    @GetMapping("/api/products/{id}")
    ProductDTO getProductById(@PathVariable("id") Long id);

    @PutMapping("/api/products/{id}/stock")
    void updateStock(@PathVariable("id") Long id, @RequestParam("quantity") int quantity);
}