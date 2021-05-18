package com.example.newAircraft.aircraft;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.opensky.api.OpenSkyApi;
import org.opensky.model.OpenSkyStates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Locale;

@Component
public class Enterdata implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Enterdata.class);

    @Autowired
    private AircraftRepo aeroRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing users");

        var a1 = new Aircraft("787");
        aeroRepository.save(a1);

        OpenSkyApi api = new OpenSkyApi("rmw2020","Labrad0r");
        OpenSkyStates os = api.getStates(0, null,
                new OpenSkyApi.BoundingBox(45.8389, 47.8229, 5.9962, 10.5226));


        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(os);
        logger.info("hello opensky" + os);


    }

}
