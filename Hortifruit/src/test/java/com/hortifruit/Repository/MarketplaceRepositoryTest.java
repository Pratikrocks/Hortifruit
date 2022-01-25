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
        Fruit fruit = fruitRepository.findById(1L).get();
        Farmer farmers = farmersRepository.findById(1L).get();
        Marketplace marketplace = Marketplace.builder().fruit(fruit).customer(customer.get(0)).farmers(farmers).build();
        marketplaceRepository.save(marketplace);
    }

    @Test
    public void findMarketplace() {
        List<Marketplace> marketplaces = Lists.newArrayList(marketplaceRepository.findAll());
        Marketplace marketplace = marketplaces.get(0);
        System.out.println(marketplace.getCustomer().getCustomerId());
    }

}