package de.egga.higher_order_java.memoization;

import org.junit.Test;

import java.util.function.Function;

import static de.egga.higher_order_java.memoization.Memoizer.memoize;

public class MemoizerTest {

    @Test
    public void shouldMemoize() {
        Fibonacci fibonacci = new Fibonacci();

        Function<Integer, Integer> memoized = memoize(fibonacci::fib);
        memoized.apply(5);
    }
}