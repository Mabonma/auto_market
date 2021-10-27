package by.kushnerevich.auto_market.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AutoImage {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_auto", nullable = false)
    private Auto auto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_image", nullable = false)
    private Image image;
}
