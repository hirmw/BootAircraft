package com.example.newAircraft.aircraft;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftRepo extends CrudRepository<Aircraft, Long> {

    List<Aircraft> findByaircraftModel(String aircraftModel);

    Aircraft findById(long id);
}
