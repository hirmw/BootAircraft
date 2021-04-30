package com.example.newAircraft.aircraft;

public class Aircraft {


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

    private final Integer aircraftID;
    private final String aircraftModel;


}
