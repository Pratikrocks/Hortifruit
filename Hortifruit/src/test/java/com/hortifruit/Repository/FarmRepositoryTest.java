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
    private CustomerRepository customersRepository;

    @Test
    public void addFruit() {
        Farm farm1 = Farm.builder().farmName("NorthVoltaic 3").farmLocation("NYCK").build();
        Farm farm2 = Farm.builder().farmName("N California 5").farmLocation("Seattle America").build();
        Fruit fruit = Fruit.builder().fruitName("Sugar Cane ").fruitType(FruitType.MEDIUM).build();

        fruit.setFarms(Arrays.asList(new Farm[]{farm1, farm2}));

        fruitRepository.save(fruit);
    }

    @Test
    public void getFruit() {
        Fruit fruit = fruitRepository.findById(6L).get();
        System.out.println(fruit.getFruitId());
    }

    @Test
    public void addFruitInFarm() {
//        Fruit fruit1 = Fruit.builder().fruitName("Litchi").fruitType(FruitType.MEDIUM).build();
//        Fruit fruit2 = Fruit.builder().fruitName("Pineapple").fruitType(FruitType.MEDIUM).build();
//
//        Farm farm1 = Farm.builder().farmName("Sam Garden-Green").farmLocation("NYC-CF").fruits(Arrays.asList(new Fruit[]{fruit1, fruit2})).build();
//
//        farmRepository.save(farm1);

        System.out.println(fruitRepository.findAll());
    }
}