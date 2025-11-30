package com.packages;

import com.packages.mainclasses.*;

public class Assignment_1 {
    private static SportCar currentCar;

    private Assignment_1() {}

    public static SportCar getCurrentCar() {
        if (currentCar == null) {
            // Initialize with some default values if needed
            currentCar = new SportCar();
        }
        return currentCar;
    }

    public static void setCurrentCar(SportCar car) {
        currentCar = car;
    }
    
    // Method that accepts interface type - demonstrates polymorphism
    public static void demonstratePolymorphism(VehicleOperations vehicle) {
        System.out.println("\nProcessing vehicle through interface:");
        System.out.println("Vehicle type: " + vehicle.getClass().getSimpleName());
        vehicle.startVehicle();
        System.out.println("Efficiency: " + vehicle.calculateEfficiency());
        System.out.println("Status: " + vehicle.getVehicleStatus());
    }
}