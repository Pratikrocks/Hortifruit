package com.hortifruit.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
// set unique constraint on email
@Table(
        uniqueConstraints = @UniqueConstraint(
                name = "customerEmail",
                columnNames = "customerEmail"
        )
)
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_seq",
            sequenceName = "customer_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private Long customerId;

    @Column(nullable = false)
    private String customerEmail;

    @Column(nullable = false)
    private String customerFirstName;

    private String customerLastName;

    @JsonIgnore
    @OneToMany(mappedBy = "customer", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Marketplace> marketplaces;
}
