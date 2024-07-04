package com.bgnc.ecommerce.exception;

public class ProductPurchaseException extends RuntimeException {
    public ProductPurchaseException(String oneOrMoreProductExists) {
        super(oneOrMoreProductExists);
    }
}
