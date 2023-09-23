package net.javaguides.springboot.services;

import net.javaguides.springboot.entities.Country;
import net.javaguides.springboot.entities.State;
import net.javaguides.springboot.interfaces.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> getStatesByCountry(Country country) {
        return stateRepository.findStateByCountry(country);
    }
}
