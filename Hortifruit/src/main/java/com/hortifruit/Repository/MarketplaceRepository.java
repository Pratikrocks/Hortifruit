package com.hortifruit.Repository;

import com.hortifruit.Entity.Marketplace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketplaceRepository extends JpaRepository<Marketplace, Long> {
}
