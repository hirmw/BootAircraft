package com.example.newAircraft.aircraft;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/aircraft")
@AllArgsConstructor

public class NewAircraftController {

    private AircraftService aircraftService;

    @PostMapping()
    public void addAircraft(@RequestBody Aircraft aircraft){
         aircraftService.addAircraft(aircraft);
    }

    @GetMapping("/aircraft")
    public List<Aircraft> getAllAircraft(){
      return aircraftService.findAll();
    }

//    @GetMapping(path = "{aircraftId}")
//    public Aircraft getAircraft(@PathVariable("aircraftId") Integer aircraftID){
//        return AIRCRAFT_LIST.stream().filter(aircraft -> aircraftID.equals(aircraft.getAircraftID()))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("aircraft " + aircraftID + "does not exist"));
//    }

//
//    @DeleteMapping(path = "{aircraftId}")
//    @PreAuthorize("hasAuthority('course:read')")
//    public Aircraft delAircraft(@PathVariable("aircraftId") Integer aircraftID){
//        return AIRCRAFT_LIST.stream().filter(aircraft -> aircraftID.equals(aircraft.getAircraftID()))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("aircraft " + aircraftID + "does not exist"));
//    }

}
