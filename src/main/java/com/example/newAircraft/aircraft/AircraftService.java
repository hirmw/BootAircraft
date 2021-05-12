package com.example.newAircraft.aircraft;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
@AllArgsConstructor
public class AircraftService {

    private AircraftRepo aircraftRepo;

    public String Test (){
        return  "hello";
    }

    public ArrayList<Aircraft> findAll() {

        Iterable<Aircraft> retrieveAll = aircraftRepo.findAll();

        ArrayList<Aircraft> aeroplanes = new ArrayList<Aircraft>();
        retrieveAll.forEach(e -> aeroplanes.add(e));

        return aeroplanes;
    }

    public void addAircraft(Aircraft aircraft){
        aircraftRepo.save(aircraft);
    }
}
