package de.egga.higher_order_java.memoization;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @Test
    public void shouldReturnRightNUmbers() {
        Fibonacci fibonacci = new Fibonacci();

        List<Integer> expected = expected();
        for (int i = 0; i < expected.size(); i++) {
            assertThat(fibonacci.fib(i)).isEqualTo(expected.get(i));
        }
    }

    private List<Integer> expected() {
        return asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377);
    }
}