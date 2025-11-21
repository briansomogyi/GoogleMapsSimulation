package org.example.maps;

public interface ITravelStrategy {
    /**
     * Calculates the total time in hours to travel the given distance.
     *
     * @param distanceInKm The distance in kilometers.
     * @return Time taken in the past hours.
     */
    double calculateTime(double distanceInKm);
}