package com.hortifruit.Controllers;

import com.hortifruit.Entity.Customer;
import com.hortifruit.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public Customer customer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }


}
