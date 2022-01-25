package com.hortifruit.Controllers;

import com.hortifruit.Entity.Customer;
import com.hortifruit.Entity.Marketplace;
import com.hortifruit.Repository.CustomerRepository;
import com.hortifruit.Repository.MarketplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Greetings {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MarketplaceRepository marketplaceRepository;

    @GetMapping("/")
    public String greetings() {
        return "Hello Welcome to Hortifruit";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/marketplaces")
    public List<Marketplace> getMarketplaces() {
        List<Marketplace> ls = marketplaceRepository.findAll();
        return marketplaceRepository.findAll();
    }
}
