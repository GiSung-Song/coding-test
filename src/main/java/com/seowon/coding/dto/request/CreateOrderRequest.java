package com.seowon.coding.dto.request;

import java.util.List;

public record CreateOrderRequest(
        String customerName,
        String customerEmail,
        List<ProductsRequest> products

) {
    public record ProductsRequest(
            Long productId,
            Integer quantity
    ) {}
}
