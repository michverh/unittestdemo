package com.example.unittestdemo.order;

class OrderBookSpecificationTest {

    private OrderBookSpecification orderBookSpecification;
    
    /*
     *  In case the createOrderCommand contains no seats we shouldn't book it.
     *  In case the createOrderCommand contains different seats than the existing order we should book it.
     *  In case the createOrderCommand contains the same seats as the existing order we shouldn't book it
     *  unless the order status of the existing order is 'SUCCESSFUL'.
     *
     */
    
    
}