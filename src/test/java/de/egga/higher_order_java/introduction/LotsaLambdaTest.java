package de.egga.higher_order_java.introduction;


import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class LotsaLambdaTest {

    @Test
    public void shouldName() {
        Map<String, Integer> counts = LotsaLambda.countFirstLetters();
        assertThat("").isEqualTo("");
    }
}