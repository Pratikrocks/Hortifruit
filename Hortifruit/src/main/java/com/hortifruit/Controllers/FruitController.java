package com.hortifruit.Controllers;

import com.hortifruit.Entity.Fruit;
import com.hortifruit.Repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
    @Autowired
    private FruitRepository fruitRepository;

    @PostMapping("/fruit")
    public void fruit(@RequestBody Fruit fruit) {
        System.out.println(fruit);
        fruitRepository.save(fruit);
    }
}
