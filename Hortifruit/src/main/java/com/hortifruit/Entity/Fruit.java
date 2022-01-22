package com.hortifruit.Entity;

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
    private String fruitId;
    private String fruitName;
    private FruitType fruitType;

    @ManyToMany(mappedBy = "fruits")
    private List<Farm> farms;
}
