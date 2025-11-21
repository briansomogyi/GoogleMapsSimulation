package org.example.maps;

public class MapsApp {
    public static void main(String[] args) {
        // Let's assume the distance from Point A to Point B is 180 km
        double distance = 180.0;

        System.out.println("--- GOOGLE MAPS SIMULATION (Distance: " + distance + "km) ---");

        // 1. Initialize Navigator with Car
        MapNavigator navigator = new MapNavigator(new CarStrategy());
        navigator.printEstimatedArrival(distance);

        // 2. Switch to Bike
        navigator.setTravelMode(new BikeStrategy());
        navigator.printEstimatedArrival(distance);

        // 3. Switch to Walking
        navigator.setTravelMode(new WalkingStrategy());
        navigator.printEstimatedArrival(distance);

        System.out.println("-----------------------------------------------------------");
    }
}