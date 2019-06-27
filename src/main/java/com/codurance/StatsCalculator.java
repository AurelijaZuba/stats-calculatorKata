package com.codurance;

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
        if(valueA >= valueB)
            return valueB;
        return valueA;
    }

    private int largestValue(int valueA, int valueB) {
        if(valueA <= valueB)
            return valueB;
        return valueA;
    }

    public int numberOfElements() {
        return numbers.size();
    }

    public double averageValue() {
        return 0;
    }
}
