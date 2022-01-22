package com.hortifruit.Repository;

import com.hortifruit.Entity.Fruit;
import org.springframework.data.repository.CrudRepository;

public interface FruitRepository extends CrudRepository<Fruit, Long> {
}
