package com.hortifruit.Controllers;

import com.hortifruit.Entity.Fruit;
import com.hortifruit.Repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {
    @Autowired
    private FruitRepository fruitRepository;

    @PostMapping("/fruit")
    public void fruit(@RequestBody Fruit fruit) {
        System.out.println(fruit);
        fruitRepository.save(fruit);
    }

    @GetMapping("/fruit/{id}")
    public Fruit fruit(@PathVariable("id") Long id) {
        return fruitRepository.findById(id).orElseThrow(() -> new RuntimeException("Fruit with " + id +  " not found"));
    }

    @GetMapping("/fruit")
    public List<Fruit> fruits() {
        return fruitRepository.findAll();
    }
}
