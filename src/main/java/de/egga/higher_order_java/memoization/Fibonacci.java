package de.egga.higher_order_java.memoization;

/**
 * @author egga
 */
public class Fibonacci {

    public Integer fib(Integer n) {
        System.out.println("fibbing " + n);
        if (n < 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
