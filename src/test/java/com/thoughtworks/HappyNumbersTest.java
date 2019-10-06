package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HappyNumbersTest {

    @Test
    void givenOne_whenCheckHappyNumber_thenItShouldBeHappyNumber(){
        HappyNumbers one = new HappyNumbers();

        assertTrue(one.isHappyNumber(1));
    }

    @Test
    void giveTen_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers ten = new HappyNumbers();

        assertTrue(ten.isHappyNumber(10));
    }

    @Test
    void givenThirteen_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers thirteen = new HappyNumbers();
        assertTrue(thirteen.isHappyNumber(13));
    }

    @Test
    void giveNineteen_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers nineteen = new HappyNumbers();

        assertTrue(nineteen.isHappyNumber(19));
    }

    @Test
    void giveHundred_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers hundred = new HappyNumbers();

        assertTrue(hundred.isHappyNumber(100));
    }

    @Test
    void givenSeven_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers seven = new HappyNumbers();

        assertTrue(seven.isHappyNumber(7));
    }

    @Test
    void givenTwentyEight_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers twentyEight = new HappyNumbers();

        assertTrue(twentyEight.isHappyNumber(28));
    }

    @Test
    void givenEleven_whenCheckHappyNumber_thenShouldBeHappyNumber(){
        HappyNumbers eight = new HappyNumbers();

        assertFalse(eight.isHappyNumber(8));
    }
}
