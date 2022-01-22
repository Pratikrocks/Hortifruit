package com.hortifruit.Repository;

import com.hortifruit.Entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm, Long> {

}
