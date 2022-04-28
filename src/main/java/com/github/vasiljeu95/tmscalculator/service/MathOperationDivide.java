package com.github.vasiljeu95.tmscalculator.service;

public class MathOperationDivide implements MathService {
    @Override
    public double mathCalculate(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
