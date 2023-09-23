package net.javaguides.springboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "state_id")
    private Long id;

    @Getter @Setter
    @Column(name = "state_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @Getter @Setter
    private Country country;

}
