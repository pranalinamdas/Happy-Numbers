package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

    private int sum = 0;
    private int reminder = 0;

    private List<Integer> sadNumbers = new ArrayList<>();

    public boolean isHappyNumber(int number) {
        int temp = number;

        sum = 0;

        if (sadNumbers.contains(number)) {
            return false;
        }

        while (number > 0) {
            reminder = number % 10;

            sum = sum + (reminder * reminder);

            number = number / 10;
        }

        if (sum == 1) {
            return true;
        }

        sadNumbers.add(temp);
        return isHappyNumber(sum);
    }
}
