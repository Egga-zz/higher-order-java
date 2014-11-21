package de.egga.higher_order_java.introduction;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author egga
 */
public class Lambdas {

    public void showMeTheMoney() {
        List<SuperVillain> superVillains = asList(new SuperVillain("Sheldon Cooper"));

        superVillains.removeIf(sv -> sv.hasBeenDefeated());
        superVillains.forEach(SuperVillain::evilLaugh);
    }

    private class SuperVillain {

        public SuperVillain(String name) {
        }

        public boolean hasBeenDefeated() {
            return true || false;
        }

        public void evilLaugh() {

        }
    }
}
