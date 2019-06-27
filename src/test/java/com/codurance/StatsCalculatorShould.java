package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StatsCalculatorShould {

    private static Stream<Arguments> minimumNumberCalculationProvider() {
        return Stream.of(
                arguments(asList(0), 0),
                arguments(asList(0, -1), -1),
                arguments(asList(5, 1), 1),
                arguments(asList(6, 9, 15, -2, 92, 11), -2)
        );
    }


    @ParameterizedTest
    @MethodSource("minimumNumberCalculationProvider")
    public void return_the_minimum_from_a_list_of_values(List<Integer> numbers, int expected) {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int result = statsCalculator.findMinimumValue();

        assertThat(result).isEqualTo(expected);
    }


    private static Stream<Arguments> maximumNumberCalculationProvider() {
        return Stream.of(
                arguments(asList(0), 0),
                arguments(asList(0,  1), 1)
        );
    }


    @ParameterizedTest
    @MethodSource("maximumNumberCalculationProvider")
    public void return_the_maximum_from_a_list_of_values(List<Integer> numbers, int expected) {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int result = statsCalculator.findMaximumValue();

        assertThat(result).isEqualTo(expected);
    }
}
