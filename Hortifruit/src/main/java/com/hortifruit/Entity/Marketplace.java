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
    private Long marketplaceId;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(
            name = "customers_marketplace_id",
            referencedColumnName = "customerId"
    )
    private Customer customer;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(
            name = "farmers_marketplace_id",
            referencedColumnName = "farmerId"
    )
    private Farmer farmers;

    @OneToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(
            name = "fruit_marketplace_id",
            referencedColumnName = "fruitId"
    )
    private Fruit fruit;
}
