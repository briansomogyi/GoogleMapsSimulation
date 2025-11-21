package org.example.maps;

public class CarStrategy implements ITravelStrategy {
    private static final double SPEED_KMH = 60.0;

    @Override
    public double calculateTime(double distanceInKm) {
        // Time = Distance / Speed
        return distanceInKm / SPEED_KMH;
    }
}