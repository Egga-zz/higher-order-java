package de.egga.higher_order_java.schwartzian_transformation;

import java.util.Random;

/**
 * @author egga
 */
public class SpaceTimeVehicle {

    private Random randomGenerator = new Random();

    public SpaceTimeVehicle() {
        randomGenerator.setSeed(5461646L);
    }

    public Integer visitPlanetAndAskForHelp(String name) {
        return randomGenerator.nextInt(2000) - 1000;
    }

}
