package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

    private int sum = 0;

    private List<Integer> sadNumbers = new ArrayList<>();

    public boolean isHappyNumber(int number) {
        int temp = number;

        sum = 0;

        if (isSadNumber(number)) {
            return false;
        }

        sumOfDigitSquares(number);

        if (sum == 1) {
            return true;
        }

        sadNumbers.add(temp);
        return isHappyNumber(sum);
    }

    private void sumOfDigitSquares(int number) {
        while ( number > 0 ) {
            int reminder = number % 10;

            sum = sum + (reminder * reminder);

            number = number / 10;
        }
    }

    private boolean isSadNumber(int number) {
        return sadNumbers.contains(number);
    }
}
