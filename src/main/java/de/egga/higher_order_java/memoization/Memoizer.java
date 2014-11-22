package de.egga.higher_order_java.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author egga
 */
public class Memoizer {

    public static <K, V> Function<K, V> memoize(Function<K, V> function) {
        Map<K, V> cache = new HashMap<>();

        return key -> {
            if (cache.containsKey(key)) {
                System.out.println("MEMOIZE READ FROM CACHE: " + key);
                return cache.get(key);
            }

            V value = function.apply(key);
            cache.put(key, value);
            System.out.println("MEMOIZE ADD TO CACHE: " + key);
            return value;
        };
    }
}
