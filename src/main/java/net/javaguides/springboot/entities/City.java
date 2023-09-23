package net.javaguides.springboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "city_id")
    private Long id;

    @Getter @Setter
    @Column(name = "city_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    @Getter @Setter
    private State state;

}
