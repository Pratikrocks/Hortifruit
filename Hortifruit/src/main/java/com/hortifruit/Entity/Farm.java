package com.hortifruit.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        uniqueConstraints={
            @UniqueConstraint(columnNames = {"farmName", "farmLocation"})
        }
)
public class Farm {
    @Id
    @SequenceGenerator(
            name = "farm_seq",
            sequenceName = "farm_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "farm_seq")
    private  Long farmId;

    @Column(nullable = false)
    private  String farmName;

    @Column(nullable = false)
    private  String farmLocation;

    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "farm_fruit",
            joinColumns = @JoinColumn(name = "farmId"),
            inverseJoinColumns = @JoinColumn(name = "fruitId")
    )
    private List<Fruit> fruits;
}
