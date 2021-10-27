package by.kushnerevich.auto_market.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private short drivetrain;

    @Column(nullable = false)
    private short transmission;

    @Column(nullable = false)
    private double volume;

    @OneToMany(mappedBy = "performance")
    private Set<Auto> autos;
}
