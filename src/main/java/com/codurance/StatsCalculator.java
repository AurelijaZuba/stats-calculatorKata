package com.codurance;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class StatsCalculator {
    private List<Integer> numbers;

    public StatsCalculator(List<Integer> numbers) {

        this.numbers = numbers;
    }

    public int findMinimumValue() {
        int value = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            value = smallestValue(value, numbers.get(i));
        }
        return value;
    }

    public int findMaximumValue() {
        int value = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            value = largestValue(value, numbers.get(i));
        }
        return value;
    }

    private int smallestValue(int valueA, int valueB) {
        if (valueA >= valueB)
            return valueB;
        return valueA;
    }

    private int largestValue(int valueA, int valueB) {
        if (valueA <= valueB)
            return valueB;
        return valueA;
    }

    public int numberOfElements() {
        return numbers.size();
    }

    public double averageValue() {
        double value = 0;
        for (int i = 0; i < numbers.size(); i++) {
            value += numbers.get(i);
        }
        double results = value / numbers.size();
        BigDecimal bigDecimal = new BigDecimal(results);
        bigDecimal = bigDecimal.setScale(6, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }
}
