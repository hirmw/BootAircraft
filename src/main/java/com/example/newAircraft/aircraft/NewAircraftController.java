package com.example.newAircraft.aircraft;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/aircraft")


public class NewAircraftController {

    private static final List<Aircraft> AIRCRAFT_LIST = Arrays.asList(
            new Aircraft(
                    1, "767"
            ),new Aircraft(
                    2, "777"
            ),new Aircraft(
                    3, "787"
            )
    );

    @GetMapping(path = "{aircraftId}")
    public Aircraft getStudent(@PathVariable("aircraftId") Integer aircraftID){
        return AIRCRAFT_LIST.stream().filter(aircraft -> aircraftID.equals(aircraft.getAircraftID()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("aircraft " + aircraftID + "does not exist"));
    }

    @DeleteMapping(path = "{aircraftId}")
    @PreAuthorize("hasAuthority('course:read')")
    public Aircraft delStudent(@PathVariable("aircraftId") Integer aircraftID){
        return AIRCRAFT_LIST.stream().filter(aircraft -> aircraftID.equals(aircraft.getAircraftID()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("aircraft " + aircraftID + "does not exist"));
    }


}
