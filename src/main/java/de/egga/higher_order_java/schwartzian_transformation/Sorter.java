package de.egga.higher_order_java.schwartzian_transformation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.sort;

/**
 * @author egga
 */
public class Sorter {

    private SpaceTimeVehicle tardis = new SpaceTimeVehicle();

    public void naive(List<Species> encounters) {
        Map<Species, Integer> appreciationBySpecies = new HashMap<>();
        for (Species species : encounters) {
            Integer appreciationLevel = tardis.visitPlanetAndAskForHelp(species.getName());
            appreciationBySpecies.put(species, appreciationLevel);
        }

        sort(encounters, new Comparator<Species>() {
            @Override
            public int compare(Species o1, Species o2) {
                return appreciationBySpecies.get(o1).compareTo(appreciationBySpecies.get(o2));
            }
        });
    }
}
