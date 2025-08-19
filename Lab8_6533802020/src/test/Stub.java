package test;

import main.DistanceConverter;



public class Stub extends DistanceConverter {
    @Override
    public double getMultiplier(String fromUnit, String toUnit) {
        return 1000.0; // บังคับเฉพาะ km → m
    }
}

