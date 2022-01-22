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
public class Farmer {
    @Id
    @SequenceGenerator(
            name = "farmer_seq",
            sequenceName = "farmer_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farmer_seq")
    private Long farmerId;

    @Column(nullable = false)
    private String farmerFirstName;

    private String farmerLastName;
    // unique email
    @Column(nullable = false)
    private String farmerEmail;

    @OneToMany(mappedBy = "farmers", cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    List<Marketplace> marketplaces;
}
