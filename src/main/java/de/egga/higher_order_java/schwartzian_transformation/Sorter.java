package de.egga.higher_order_java.schwartzian_transformation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Collections.sort;
import static java.util.stream.Collectors.toList;

/**
 * @author egga
 */
public class Sorter {

    private SpaceTimeVehicle tardis = new SpaceTimeVehicle();

    public void sortUsingCache(List<Species> encounteredSpecies) {
        Map<Species, Integer> appreciationBySpecies = new HashMap<>();
        for (Species species : encounteredSpecies) {
            Integer appreciationLevel = tardis.visitPlanetAndAskForHelp(species.getName());
            appreciationBySpecies.put(species, appreciationLevel);
        }

        sort(encounteredSpecies, new Comparator<Species>() {
            @Override
            public int compare(Species o1, Species o2) {
                return appreciationBySpecies.get(o1).compareTo(appreciationBySpecies.get(o2));
            }
        });
    }

    public void sortLikeSchwartz(List<Species> encounters) {
        encounters.stream()
                .map(s -> asList(tardis.visitPlanetAndAskForHelp(s.getName()), s))
                .sorted(Comparator.comparing(s -> (Integer) s.get(0)))
                .map(s -> s.get(1))
                .collect(toList());
    }
}
