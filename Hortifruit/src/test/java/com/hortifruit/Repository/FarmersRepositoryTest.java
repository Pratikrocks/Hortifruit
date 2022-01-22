package com.hortifruit.Repository;

import com.hortifruit.Entity.Farmer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FarmersRepositoryTest {
    @Autowired
    FarmersRepository farmersRepository;

    @Test
    public void addFarmer() {
        Farmer farmer = Farmer.builder().farmerFirstName("Sam").farmerLastName("Doe").farmerEmail("jadev@gmail.com").build();
        farmersRepository.save(farmer);
//        assertNotNull(customer.getCustomerId());
        List<Farmer> farmers = farmersRepository.findAll();
        System.out.println(farmers);
    }

    @Test
    public void findAll(){
        List<Farmer> farmers = farmersRepository.findAll();
        System.out.println(farmers);
    }

    @Test
    public void findByFarmerId(){
        Farmer farmers = farmersRepository.findById(5L).get();
        System.out.println(farmers);
    }


}