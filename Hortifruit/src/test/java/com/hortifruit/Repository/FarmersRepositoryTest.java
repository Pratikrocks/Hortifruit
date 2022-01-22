package com.hortifruit.Repository;

import com.hortifruit.Entity.Farmers;
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
        Farmers farmer = Farmers.builder().farmerFirstName("Sam").farmerLastName("Doe").farmerEmail("jadev@gmail.com").build();
        farmersRepository.save(farmer);
//        assertNotNull(customer.getCustomerId());
        List<Farmers> farmers = farmersRepository.findAll();
        System.out.println(farmers);
    }

    @Test
    public void findAll(){
        List<Farmers> farmers = farmersRepository.findAll();
        System.out.println(farmers);
    }

    @Test
    public void findByFarmerId(){
        Farmers farmers = farmersRepository.findById(5L).get();
        System.out.println(farmers);
    }


}