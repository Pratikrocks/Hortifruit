package com.hortifruit.Repository;

import com.hortifruit.Entity.Customer;
import com.hortifruit.Entity.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MarketplaceRepositoryTest {
    @Autowired
    private MarketplaceRepository marketplaceRepository;

    @Autowired
    private FarmRepository farmRepository;

    @Autowired
    private FruitRepository fruitRepository;

    @Autowired
    CustomersRepository customersRepository;

    @Autowired
    FarmersRepository farmersRepository;

    @Test
    public void addMarketplace() {
        List<Customer> customer = customersRepository.findAll();
        List<Fruit> fruit = (List<Fruit>) fruitRepository.findAll();
        System.out.println(customer);
//        Farmer farmers = farmersRepository.findById(5L).get();
//        Marketplace marketplace = Marketplace.builder().fruit(fruit).customer(customer).farmers(farmers).build();
//
//        marketplaceRepository.save(marketplace);
    }

}