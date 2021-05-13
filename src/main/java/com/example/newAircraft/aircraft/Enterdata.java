package com.example.newAircraft.aircraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

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

    }

}
