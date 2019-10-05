package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

    private int sum = 0;
    int reminder = 0;

    List<Integer> happyNumbers = new ArrayList<>();

    public boolean isHappyNumber(int number) {

        if (!happyNumbers.contains(number)) {
            return true;
        }

        while (number > 0) {
            reminder = number % 10;

            sum = sum + (reminder * reminder);

            number = number / 10;

        }

        if (sum == 1) {
            happyNumbers.add(sum);
            return true;
        }
        isHappyNumber(sum);

        return number == 1;
    }
}
