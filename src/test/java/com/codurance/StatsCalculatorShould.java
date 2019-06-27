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
                arguments(asList(0,  1), 1),
                arguments(asList(6, 9, 15, -2, 92, 11), 92)
        );
    }

    @ParameterizedTest
    @MethodSource("maximumNumberCalculationProvider")
    public void return_the_maximum_from_a_list_of_values(List<Integer> numbers, int expected) {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int result = statsCalculator.findMaximumValue();

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void return_number_of_elements() {
        List<Integer> numbers = asList(6, 9, 15, -2, 92, 11);
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        int expected = 6;
        int result = statsCalculator.numberOfElements();

        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> averageNumberProvider(){
        return Stream.of(
                arguments(asList(0), 0),
                arguments(asList(1, 1), 1),
                arguments(asList(1, 2), 1.5),
                arguments(asList(1, 4, 5), 3.333333),
                arguments(asList(6, 9, 15, -2, 92, 11), 21.833333)
        );
    }

    @ParameterizedTest
    @MethodSource("averageNumberProvider")
    void return_average_number(List<Integer> numbers, double expected) {
        StatsCalculator statsCalculator = new StatsCalculator(numbers);

        double result = statsCalculator.averageValue();

        assertThat(result).isEqualTo(expected);
    }


}
