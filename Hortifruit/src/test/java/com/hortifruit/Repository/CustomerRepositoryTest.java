package com.hortifruit.Repository;

import com.hortifruit.Entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customersRepository;

    @Test
    public void addCustomer() {
        Customer customer = Customer.builder().customerFirstName("Sam").customerLastName("Curran").customerEmail("Ronbon@gmail.com").build();
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