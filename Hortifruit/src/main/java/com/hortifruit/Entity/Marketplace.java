package com.hortifruit.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Marketplace {
    @Id
    @SequenceGenerator(
            name = "marketplace_seq",
            sequenceName = "marketplace_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marketplace_seq")
    private String marketplaceId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(
            name = "customers_marketplace_id",
            referencedColumnName = "customerId"
    )
    private Customers customers;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(
            name = "farmers_marketplace_id",
            referencedColumnName = "farmerId"
    )
    private Farmers farmers;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(
            name = "fruit_marketplace_id",
            referencedColumnName = "fruitId"
    )
    private Fruit fruit;
}
