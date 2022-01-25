package com.hortifruit.Controllers;

import com.hortifruit.Entity.Marketplace;
import com.hortifruit.Repository.MarketplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketplaceControllers {
    @Autowired
    private MarketplaceRepository marketplaceRepository;

    @PostMapping("/marketplace")
    public Marketplace addMarketplace(@RequestBody Marketplace marketplace) {
        System.out.println(marketplace);
        return marketplaceRepository.save(marketplace);
    }

    @GetMapping("/marketplace")
    public List<Marketplace> getMarketplaces() {
        return marketplaceRepository.findAll();
    }

    @GetMapping("/marketplace/{id}")
    public Marketplace getMarketplace(@PathVariable("id") Long id) {
        return marketplaceRepository.findById(id).get();
    }
}
