package net.javaguides.springboot.services;

import net.javaguides.springboot.entities.City;
import net.javaguides.springboot.entities.State;
import net.javaguides.springboot.interfaces.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getCitiesByState(State state) {
        return cityRepository.findByState(state);
    }
}
