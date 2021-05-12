package com.example.newAircraft.aircraft;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity

public class Aircraft {

    @Id
    @SequenceGenerator(
            name = "aircraft",
            sequenceName = "aircraft_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "aircraft_sequence"
    )

    private Integer aircraftID;
    private String aircraftModel;

    public Aircraft(Integer aircraftID, String aircraftModel) {
        this.aircraftID = aircraftID;
        this.aircraftModel = aircraftModel;
    }


    public Integer getAircraftID() {
        return aircraftID;
    }
    public String getAircraftModel() {
        return aircraftModel;
    }



}
