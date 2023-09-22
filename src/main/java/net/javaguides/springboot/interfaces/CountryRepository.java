package net.javaguides.springboot.interfaces;

import net.javaguides.springboot.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CountryRepository extends JpaRepository<Country, Long> {
}
