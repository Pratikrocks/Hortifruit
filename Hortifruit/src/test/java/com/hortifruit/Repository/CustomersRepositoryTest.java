package com.hortifruit.Repository;

import com.hortifruit.Entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CustomersRepositoryTest {
    @Autowired
    CustomersRepository customersRepository;

    @Test
    public void addCustomer() {
        Customer customer = Customer.builder().customerFirstName("Ron").customerLastName("Doe").customerEmail("Ron@gmail.com").build();
        customersRepository.save(customer);
//        assertNotNull(customer.getCustomerId());
        List<Customer> customers = customersRepository.findAll();
        System.out.println(customers);
    }

    @Test
    public void findAll(){
        List<Customer> customers = customersRepository.findAll();
        System.out.println(customers);
    }

    @Test
    public void findByCustomerId(){
        Customer customer = customersRepository.findById(2L).get();
        System.out.println(customer);
    }

}