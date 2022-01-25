package com.hortifruit.Controllers;

import com.hortifruit.Entity.Farmer;
import com.hortifruit.Repository.FarmersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FarmerController {
    @Autowired
    private FarmersRepository farmersRepository;

    @PostMapping("/farmer")
    public Farmer farmer(@RequestBody Farmer farmer) {
        return farmersRepository.save(farmer);
    }

    @GetMapping("/farmer")
    public List<Farmer> farmer() {
        return farmersRepository.findAll();
    }
}
