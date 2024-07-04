package com.bgnc.ecommerce.order;

import com.bgnc.ecommerce.customer.CustomerClient;
import com.bgnc.ecommerce.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerClient customerClient;

    // TODO inject the  mapper

    // Todo productclient

    public Integer createOrder(OrderRequest request) {
        // Todo check the first customer --> openFeign
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(()->
                        new BusinessException("Cannot create order : no customer exists the provided customerId"));

        return null;




        // purchase the product --> product microservice


        // persist order

        // persist the orderlines

        // start the payment process

        // send the order confiromation - notification microservice(kafka)


    }
}
