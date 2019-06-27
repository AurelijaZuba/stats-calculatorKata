package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StatsCalculatorShould {

    @Test
    void return_single_value_for_minimum_value() {
        List<Integer> stats = new ArrayList<>();
        stats.add(0);
        int expected = 0;

        StatsCalculator statsCalculator = new StatsCalculator(stats);

        int result = statsCalculator.calculateMinimum();

        assertThat(result).isEqualTo(expected);
    }
}
