package com.jennyales.customermanager.service;

import com.jennyales.customermanager.exception.UserNotFoundException;
import com.jennyales.customermanager.madel.Customer;
import com.jennyales.customermanager.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer (Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer updateCustomer (Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(Long id){
        return customerRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Customer with id "+id+"not found"));
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }
}
