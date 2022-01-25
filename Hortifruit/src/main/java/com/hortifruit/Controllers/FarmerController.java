package com.hortifruit.Controllers;

import com.hortifruit.Entity.Farmer;
import com.hortifruit.Repository.FarmersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController {
    @Autowired
    private FarmersRepository farmersRepository;

    @PostMapping("/farmer")
    public Farmer farmer(@RequestBody Farmer farmer) {
        return farmersRepository.save(farmer);
    }
}
