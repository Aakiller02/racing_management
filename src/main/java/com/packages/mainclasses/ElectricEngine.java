package com.packages.mainclasses;

public class ElectricEngine extends SportCar{
    private int batteryCapacity;
    private int chargingTime;
    private int range;
    private String motorType;
    
    public ElectricEngine() {
        super();
        this.batteryCapacity = 0;
        this.chargingTime = 0;
        this.range = 0;
        this.motorType = "Unknown";
    }
    
    public ElectricEngine(String brand, String model, int year, int price,
                         double engineCapacity, String fuelType, double mileage,
                         int batteryCapacity, int chargingTime, int range, String motorType) {
        super(brand, model, year, price, engineCapacity, fuelType, mileage);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
        this.range = range;
        this.motorType = motorType;
    }
    
    // Polymorphism interface method but different from base class
    @Override
    public void startVehicle() {
        System.out.println("Electric motor activating... Silent startup complete!");
    }
    
    @Override
    public void stopVehicle() {
        System.out.println("Electric motor deactivating... Regenerative braking engaged!");
    }
    
    @Override
    public double calculateEfficiency() {
        return (double) range / batteryCapacity; // km per kWh for electric cars
    }
    
    @Override
    public String getVehicleStatus() {
        return "Electric vehicle - Zero emissions, " + range + "km range available";
    }
    
    @Override
    public String engineType(){
        return "Electric";
    }

    // OVERRIDDEN BASE CLASS METHODS
    @Override
    public void displayCarInfo() {
        System.out.println("\n=== ELECTRIC ENGINE CAR ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Price: RM" + getPrice());
        System.out.println("Motor Type: " + motorType);
        System.out.println("Battery: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.println("Range: " + range + " km per charge");
        System.out.println("Fuel Type: " + getFuelType());
    }

    @Override
    public double calculateMaintenanceCost() {
        double baseCost = getPrice() * 0.02;
        double batteryMaintenance = batteryCapacity * 10;
        return baseCost + batteryMaintenance;
    }

    @Override
    public String getCarType() {
        return "Electric Engine Sport Car";
    }

    @Override
    public void performService() {
        System.out.println("Performing electric car maintenance:");
        System.out.println("- Battery health check and calibration");
        System.out.println("- Electric motor inspection");
        System.out.println("- Software updates and diagnostics");
        System.out.println("- Charging system maintenance");
    }
    
    @Override
    public void startEngine() {
        System.out.println("Electric motor activating... Silent whirring sound!");
    }
    
    @Override
    public double calculateFuelCost(double distance, double electricityRate) {
        double energyNeeded = (distance / range) * batteryCapacity;
        return energyNeeded * electricityRate;
    }
    
    // ELECTRIC-SPECIFIC METHODS
    public double calculateChargingCost(double electricityRate) {
        return batteryCapacity * electricityRate;
    }
    
    public boolean canReachDestination(int distance) {
        return distance <= range;
    }
    
    public double getEfficiency() {
        return (double) range / batteryCapacity;
    }
    
    // GETTER AND SETTER METHODS
    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }
    
    public int getChargingTime() { return chargingTime; }
    public void setChargingTime(int chargingTime) { this.chargingTime = chargingTime; }
    
    public int getRange() { return range; }
    public void setRange(int range) { this.range = range; }
    
    public String getMotorType() { return motorType; }
    public void setMotorType(String motorType) { this.motorType = motorType; }
}
