package com.github.vasiljeu95.tmscalculator.service;

public class MathOperationFactory {
    private static MathService selectMathService (String operation) {
        // TODO
        MathService mathService;
        switch (operation) {
            case ("sum"):
                mathService = new MathOperationSum();
                break;
            case ("minus"):
                mathService = new MathOperationMinus();
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + operation);
        }
        return mathService;
    }

    public static MathService getInstance(String operation) {
        return new MathOperationFactory().selectMathService(operation);
    }
}
