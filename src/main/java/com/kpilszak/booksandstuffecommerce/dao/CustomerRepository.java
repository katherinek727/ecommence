package com.kpilszak.booksandstuffecommerce.dao;

import com.kpilszak.booksandstuffecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
