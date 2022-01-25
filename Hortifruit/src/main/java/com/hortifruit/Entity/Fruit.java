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
        uniqueConstraints = @UniqueConstraint(
                name = "fruitName",
                columnNames = "fruitName"
        )
)
public class Fruit {
    @Id
    @SequenceGenerator(
            name = "fruit_seq",
            sequenceName = "fruit_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fruit_seq")
    private Long fruitId;

    @Column(nullable = false)
    private String fruitName;

    @Column(nullable = false)
    private FruitType fruitType;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "farm_fruit",
            joinColumns = @JoinColumn(name = "fruitId"),
            inverseJoinColumns = @JoinColumn(name = "farmId")
    )
    private List<Farm> farms;

    @JsonIgnore
    @OneToOne(cascade = {CascadeType.ALL},mappedBy = "fruit", fetch = FetchType.LAZY, orphanRemoval = true)
    private Marketplace marketplace;
}
