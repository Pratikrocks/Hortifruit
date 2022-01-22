package com.hortifruit.Repository;

import com.hortifruit.Entity.Farm;
import com.hortifruit.Entity.Fruit;
import com.hortifruit.Entity.FruitType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class FarmRepositoryTest {
    @Autowired
    private FarmRepository farmRepository;

    @Autowired
    private FruitRepository fruitRepository;

    @Autowired
    private CustomersRepository customersRepository;

    @Test
    public void addFruit() {
        Farm farm1 = Farm.builder().farmName("Sam Garden-Green").farmLocation("NYC").build();
        Farm farm2 = Farm.builder().farmName("Rock Farm Grey").farmLocation("Seattle").build();
        Fruit fruit = Fruit.builder().fruitName("Guava").fruitType(FruitType.MEDIUM).farms(Arrays.asList(new Farm[]{farm1, farm2})).build();

        fruitRepository.save(fruit);
    }

    @Test
    public void getFruit() {
        Fruit fruit = fruitRepository.findById(1L).get();
        System.out.println(fruit);

        System.out.println(fruitRepository.findAll());
    }

    @Test
    public void addFruitInFarm() {
//        Fruit fruit1 = Fruit.builder().fruitName("Litchi").fruitType(FruitType.MEDIUM).build();
//        Fruit fruit2 = Fruit.builder().fruitName("Pineapple").fruitType(FruitType.MEDIUM).build();
//
//        Farm farm1 = Farm.builder().farmName("Sam Garden-Green").farmLocation("NYC-CF").fruits(Arrays.asList(new Fruit[]{fruit1, fruit2})).build();
//
//        farmRepository.save(farm1);

        System.out.println(farmRepository.findById(1L).get());
    }
}