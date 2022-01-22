package com.hortifruit.Repository;

import com.hortifruit.Entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmersRepository extends JpaRepository<Farmer, Long> {
}
