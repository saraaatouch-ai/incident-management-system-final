package com.example.order_service.DTO;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
}