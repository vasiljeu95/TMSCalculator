package com.github.vasiljeu95.tmscalculator.service;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationSumTest {
    @Test
    void sum() {
        MathOperationSum mathOperationSum = new MathOperationSum();
        double sum = mathOperationSum.mathCalculate(2, 2);
        assertEquals(4, sum);
    }
}