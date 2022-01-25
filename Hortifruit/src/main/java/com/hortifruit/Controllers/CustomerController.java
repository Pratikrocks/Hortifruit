package com.hortifruit.Controllers;

import com.hortifruit.Entity.Customer;
import com.hortifruit.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public Customer customer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/customer")
    public List<Customer> customer() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer customer(@PathVariable("id") Long id) {
        return customerRepository.findById(id).get();
    }
}
