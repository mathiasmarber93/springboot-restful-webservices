package net.javaguides.springboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "country_id")
    private Long id;

    @Getter @Setter
    @Column(name = "country_name")
    private String name;


}
