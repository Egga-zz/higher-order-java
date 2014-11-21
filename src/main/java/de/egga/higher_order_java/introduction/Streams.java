package de.egga.higher_order_java.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author egga
 */
public class Streams {

    public void streamItBaby() {
        Stream.of("Zed", "Zed", "Zed");

        List<Walker> undead = new ArrayList<>();
        Stream<Walker> problem = undead.stream();

        Stream<Walker> zombies = Stream.generate(() -> new Walker());
        zombies.forEach(Walker::tryToEatAllBrains);
    }

    private class Walker {

        public void tryToEatAllBrains() {
        }
    }
}
