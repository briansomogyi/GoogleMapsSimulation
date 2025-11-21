package org.example.maps;

public class BikeStrategy implements ITravelStrategy {
    private static final double SPEED_KMH = 30.0;
    private static final double BREAK_INTERVAL_KM = 100.0;
    private static final double BREAK_DURATION_HOURS = 10.0 / 60.0; // 10 minutes in hours

    @Override
    public double calculateTime(double distanceInKm) {
        double travelTime = distanceInKm / SPEED_KMH;

        // Calculate breaks. We subtract a tiny amount (0.001) to ensure that
        // if the distance is exactly 100 km, we don't take a break at the finish line.
        int numberOfBreaks = (int) ((distanceInKm - 0.001) / BREAK_INTERVAL_KM);

        // Avoid negative breaks if the distance is 0
        if (numberOfBreaks < 0) numberOfBreaks = 0;

        double breakTime = numberOfBreaks * BREAK_DURATION_HOURS;

        return travelTime + breakTime;
    }
}