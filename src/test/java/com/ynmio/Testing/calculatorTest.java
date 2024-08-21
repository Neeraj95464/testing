package com.ynmio.Testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class calculatorTest {

    Calculator calculatorObj =new Calculator();
    @BeforeEach
    void setUp() {
        System.out.println("Before Each in setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each in tearDown");
    }

    @Test
    public void doSumZero() {
        int expected = 0;
        int received = calculatorObj.doSum(0, 0);
        assertEquals(expected, received);
    }

    @Test
    public void doSumNegativeNumbers() {
        int expected = -9;
        int received = calculatorObj.doSum(-4, -5);
        assertEquals(expected, received);
    }

    @Test
    public void doSumLargeNumbers() {
        int expected = 10000;
        int received = calculatorObj.doSum(5000, 5000);
        assertEquals(expected, received);
    }

}