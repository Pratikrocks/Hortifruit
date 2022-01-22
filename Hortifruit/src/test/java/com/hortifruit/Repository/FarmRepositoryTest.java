package com.hortifruit.Repository;

import com.hortifruit.Entity.Farm;
import com.hortifruit.Entity.Fruit;
import com.hortifruit.Entity.FruitType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FarmRepositoryTest {
    @Autowired
    private FarmRepository farmRepository;

    @Autowired
    private FruitRepository fruitRepository;

    @Test
    public void addFruit() {
        Farm farm1 = Farm.builder().farmName("Sam Garden").farmLocation("NYC").build();
        Farm farm2 = Farm.builder().farmName("Rock Farm").farmLocation("Seattle").build();
        Fruit fruit = Fruit.builder().fruitName("Mango").fruitType(FruitType.MEDIUM).farms(List.of(new Farm[]{farm1, farm2})).build();

        fruitRepository.save(fruit);
    }

    @Test
    public void getFruit() {
        Fruit fruit = fruitRepository.findById(1L).get();
        System.out.println(fruit);
    }
}