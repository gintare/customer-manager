package com.jennyales.customermanager.repository;

import com.jennyales.customermanager.madel.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerById(Long id);
}
