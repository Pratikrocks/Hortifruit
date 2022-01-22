package com.hortifruit.Repository;

import com.hortifruit.Entity.Customer;
import com.hortifruit.Entity.Farmer;
import com.hortifruit.Entity.Fruit;
import com.hortifruit.Entity.Marketplace;
import org.assertj.core.util.Lists;
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
    CustomerRepository customerRepository;

    @Autowired
    FarmersRepository farmersRepository;

    @Test
    public void addMarketplace() {
        List<Customer> customer = customerRepository.findAll();
        Iterable<Fruit> fruitsIterator = fruitRepository.findAll();
        List<Fruit> fruits = Lists.newArrayList(fruitsIterator);
//        System.out.println(fruits);
        Farmer farmers = farmersRepository.findById(6L).get();
        Marketplace marketplace = Marketplace.builder().fruit(fruits.get(0)).customer(customer.get(0)).farmers(farmers).build();
////
        marketplaceRepository.save(marketplace);
    }

    @Test
    public void findMarketplace() {
        List<Marketplace> marketplaces = Lists.newArrayList(marketplaceRepository.findAll());
        Marketplace marketplace = marketplaces.get(0);
    }

}