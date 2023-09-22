package net.javaguides.springboot.controllers;

import net.javaguides.springboot.entities.Country;
import net.javaguides.springboot.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
//@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/all")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

}
