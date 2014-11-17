package de.egga.higher_order_java.introduction;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author egga
 */
public class LotsaLambda {

    static Map<String, Integer> countFirstLetters() {
        Stream<String> firstLetters =
                Manifesto.getSigners()
                        .map(name -> name.split("\\s+"))
                        .flatMap(Stream::of)
                        .map(word -> word.substring(0, 1));

        Map<String, Integer> counts = new HashMap<>();
        firstLetters
                .distinct()
                .iterator().forEachRemaining(
                letter -> counts.put(letter, 0)
        );
        firstLetters.iterator().forEachRemaining(
                letter -> counts.put(letter, counts.get(letter) + 1)
        );

        return counts;
    }
}
