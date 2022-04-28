package com.github.vasiljeu95.tmscalculator.service;

public class MathOperationMultiply implements MathService {
    @Override
    public double mathCalculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
