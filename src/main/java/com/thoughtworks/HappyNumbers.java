package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

    private List<Integer> sadNumbers = new ArrayList<>();

    public boolean isHappyNumber(int number) {

        if (isSadNumber(number)) {
            return false;
        }

        int sum = sumOfDigitSquares(number);

        if (sum == 1) {
            return true;
        }

        sadNumbers.add(number);
        return isHappyNumber(sum);
    }

    private int sumOfDigitSquares(int number) {
        int sum = 0;
        while ( number > 0 ) {
            int reminder = number % 10;

            sum = sum + (reminder * reminder);

            number = number / 10;
        }
        return sum;
    }

    private boolean isSadNumber(int number) {
        return sadNumbers.contains(number);
    }
}
