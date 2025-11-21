package org.example.maps;

public class MapNavigator {
    private ITravelStrategy _strategy;

    // Default to Car if nothing else is set, or force setting it in constructor
    public MapNavigator(ITravelStrategy defaultStrategy) {
        this._strategy = defaultStrategy;
    }

    public void setTravelMode(ITravelStrategy strategy) {
        this._strategy = strategy;
    }

    public void printEstimatedArrival(double distanceInKm) {
        if (_strategy == null) {
            System.out.println("Please select a mode of transport.");
            return;
        }

        double timeInHours = _strategy.calculateTime(distanceInKm);

        // Convert hours to readable format (Hours and Minutes)
        int hours = (int) timeInHours;
        int minutes = (int) Math.round((timeInHours - hours) * 60);

        System.out.println("Estimated time for " + distanceInKm + "km: " + hours + "h " + minutes + "m " + "(Strategy: " + _strategy.getClass().getSimpleName() + ")");
    }
}