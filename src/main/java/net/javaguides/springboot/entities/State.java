package net.javaguides.springboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String stateName;

    @ManyToOne
    @JoinColumn(name = "id")
    @Getter @Setter
    private Country countryId;

}
