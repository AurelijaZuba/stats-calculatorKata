package com.codurance;

import java.util.List;

public class StatsCalculator {
    private List<Integer> numbers;

    public StatsCalculator(List<Integer> numbers) {

        this.numbers = numbers;
    }

    public int calculateMinimum() {
        int value = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(value >= numbers.get(i))
                value = numbers.get(i);
        }
        return value;
    }
}
