package com.hortifruit.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customers {
    @Id
    @SequenceGenerator(
            name = "customer_seq",
            sequenceName = "course_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @Column(name = "customer_id")
    private String id;
    private String customerEmail;
    private String customerFirstName;
    private String customerLastName;
}
