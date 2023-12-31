package com.kpilszak.booksandstuffecommerce.dto;

import com.kpilszak.booksandstuffecommerce.entity.Address;
import com.kpilszak.booksandstuffecommerce.entity.Customer;
import com.kpilszak.booksandstuffecommerce.entity.Order;
import com.kpilszak.booksandstuffecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
