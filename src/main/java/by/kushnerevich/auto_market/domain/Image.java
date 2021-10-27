package by.kushnerevich.auto_market.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private byte[] image;

    @Column(nullable = false, name = "main")
    private boolean isMain;

    @OneToMany(mappedBy = "image")
    private Set<AutoImage> autoImages;
}
