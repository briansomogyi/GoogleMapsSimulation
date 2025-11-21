package org.example.maps;

public class WalkingStrategy implements ITravelStrategy {
    private static final double SPEED_KMH = 6.0;
    private static final double BREAK_INTERVAL_KM = 30.0;
    private static final double BREAK_DURATION_HOURS = 0.5; // 30 minutes

    @Override
    public double calculateTime(double distanceInKm) {
        double travelTime = distanceInKm / SPEED_KMH;

        // Calculate breaks. Don't rest if we arrived exactly at the marker.
        int numberOfBreaks = (int) ((distanceInKm - 0.001) / BREAK_INTERVAL_KM);

        if (numberOfBreaks < 0) numberOfBreaks = 0;

        double breakTime = numberOfBreaks * BREAK_DURATION_HOURS;

        return travelTime + breakTime;
    }
}