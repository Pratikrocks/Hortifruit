package com.hortifruit.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        uniqueConstraints = @UniqueConstraint(
                name = "farmerEmail",
                columnNames = "farmerEmail"
        )
)
public class Farmers {
    @Id
    @SequenceGenerator(
            name = "farmer_seq",
            sequenceName = "farmer_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmer_seq")
    private int farmerId;

    @Column(nullable = false)
    private String farmerFirstName;

    private String farmerLastName;
    // unique email
    @Column(nullable = false)
    private String farmerEmail;

    @OneToMany(mappedBy = "farmers", cascade = CascadeType.ALL)
    List<Marketplace> marketplaces;
}
