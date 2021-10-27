package by.kushnerevich.auto_market.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_style", nullable = false)
    private Style style;

    @ManyToOne
    @JoinColumn(name = "id_performance", nullable = false)
    private Performance performance;

    @Column(nullable = false)
    private String fuel;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private double milage;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean news;

    @OneToMany(mappedBy = "auto")
    private Set<AutoImage> autoImages;
}
