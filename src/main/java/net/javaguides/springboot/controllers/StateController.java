package net.javaguides.springboot.controllers;

import net.javaguides.springboot.entities.State;
import net.javaguides.springboot.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/states")
@CrossOrigin(origins = "http://localhost:4200")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/{countryID}")
    public List<State> getStatesByCountry(@RequestParam Long countryID){
        return stateService.getStatesByCountry(countryID);
    }

}
