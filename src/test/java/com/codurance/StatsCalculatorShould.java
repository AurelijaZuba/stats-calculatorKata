package com.codurance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StatsCalculatorShould {

    @Test
    void return_single_value_for_minimum_value() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        int expected = 0;

        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int result = statsCalculator.findMinimumValue();

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void return_the_minimum_from_a_list_of_multiple_values() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(-1);
        StatsCalculator statsCalculator = new StatsCalculator(numbers);
        int expected = -1;

        int result = statsCalculator.findMinimumValue();

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void foo() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        StatsCalculator statsCalculator = new StatsCalculator(numbers);
        int expected = 1;

        int result = statsCalculator.findMinimumValue();

        assertThat(result).isEqualTo(expected);
    }
}
