package net.javaguides.springboot.interfaces;

import net.javaguides.springboot.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findStateByCountryId(Long countryID);
}
