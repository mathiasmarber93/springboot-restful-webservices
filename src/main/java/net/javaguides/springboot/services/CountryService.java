package net.javaguides.springboot.services;

import net.javaguides.springboot.entities.Country;
import net.javaguides.springboot.interfaces.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

}
