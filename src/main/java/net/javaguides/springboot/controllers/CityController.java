package net.javaguides.springboot.controllers;

import net.javaguides.springboot.entities.City;
import net.javaguides.springboot.entities.State;
import net.javaguides.springboot.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/state/{stateId}")
    public List<City> getCitiesByState(@PathVariable Long stateId){
        State state = new State();
        state.setId(stateId);
        return cityService.getCitiesByState(state);
    }

}
