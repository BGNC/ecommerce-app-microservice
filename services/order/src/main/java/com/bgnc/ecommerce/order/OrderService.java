package com.bgnc.ecommerce.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    // TODO inject the  mapper


    public Integer createOrder(OrderRequest request) {



        // Todo check the first customer
    }
}
