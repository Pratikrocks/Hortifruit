package com.hortifruit.Entity;

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
public class Customers {
    @Id
    @SequenceGenerator(
            name = "customer_seq",
            sequenceName = "course_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private String customerId;
    private String customerEmail;
    private String customerFirstName;
    private String customerLastName;


    @OneToMany(mappedBy = "customers", cascade = CascadeType.ALL)
    private List<Marketplace> marketplaces;
}
