package com.packages.mainclasses;

public class HybridEngine extends SportCar {
    private int batteryCapacity;
    private int electricRange;
    private String hybridType;
    private boolean hasRegenerativeBraking;
    private String powerMode;
    
    public HybridEngine() {
        super();
        this.batteryCapacity = 0;
        this.electricRange = 0;
        this.hybridType = "Unknown";
        this.hasRegenerativeBraking = false;
        this.powerMode = "Hybrid";
    }
    
    public HybridEngine(String brand, String model, int year, int price,
                       double engineCapacity, String fuelType, double mileage,
                       int batteryCapacity, int electricRange, String hybridType, 
                       boolean hasRegenerativeBraking, String powerMode) {
        super(brand, model, year, price, engineCapacity, fuelType, mileage);
        this.batteryCapacity = batteryCapacity;
        this.electricRange = electricRange;
        this.hybridType = hybridType;
        this.hasRegenerativeBraking = hasRegenerativeBraking;
        this.powerMode = powerMode;
    }
    
    // INTERFACE METHOD IMPLEMENTATIONS (DIFFERENT FROM OTHERS)
    @Override
    public void startVehicle() {
        System.out.println("Hybrid system initializing...");
        System.out.println("Electric motor ready... Engine starting smoothly in hybrid mode!");
    }
    
    @Override
    public void stopVehicle() {
        System.out.println("Hybrid system shutting down... Storing energy for next start!");
    }
    
    @Override
    public double calculateEfficiency() {
        // Combined efficiency calculation for hybrid
        double electricEfficiency = (double) electricRange / batteryCapacity;
        double fuelEfficiency = getMileage();
        return (electricEfficiency + fuelEfficiency) / 2; // Average efficiency
    }
    
    @Override
    public String getVehicleStatus() {
        return "Hybrid vehicle - " + powerMode + " mode active, " + 
               electricRange + "km electric range available";
    }

    @Override
    public String engineType(){
        return "Hybrid";
    }
    
    @Override
    public void displayCarInfo() {
        System.out.println("\n=== HYBRID ENGINE CAR ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Price: RM" + getPrice());
        System.out.println("Engine: " + getEngineCapacity() + "L + Electric Motor");
        System.out.println("Hybrid Type: " + hybridType);
        System.out.println("Battery: " + batteryCapacity + " kWh");
        System.out.println("Electric Range: " + electricRange + " km");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Combined Mileage: " + getMileage() + " km/L");
        System.out.println("Regenerative Braking: " + (hasRegenerativeBraking ? "Yes" : "No"));
        System.out.println("Current Power Mode: " + powerMode);
    }

    @Override
    public double calculateMaintenanceCost() {
        double engineCost = getPrice() * 0.04;
        double electricCost = batteryCapacity * 8;
        double hybridSystemCost = 200;
        return engineCost + electricCost + hybridSystemCost;
    }

    @Override
    public String getCarType() {
        return "Hybrid Engine Sport Car";
    }

    @Override
    public void performService() {
        System.out.println("Performing hybrid car maintenance:");
        System.out.println("- Engine oil and filter change");
        System.out.println("- Battery system health check");
        System.out.println("- Hybrid system diagnostics");
        System.out.println("- Regenerative braking system: " + (hasRegenerativeBraking ? "Check" : "N/A"));
        System.out.println("- Power control unit inspection");
        System.out.println("- Dual cooling system maintenance");
    }
    
    @Override
    public void startEngine() {
        System.out.println("Hybrid system initializing... Electric motor ready!");
    }
    
    @Override
    public double calculateFuelCost(double distance, double fuelPrice) {
        // Hybrid uses both electric and fuel - more complex calculation
        double electricPortion = Math.min(distance, electricRange);
        double fuelPortion = distance - electricPortion;
        
        double electricCost = (electricPortion / electricRange) * batteryCapacity * 0.3; // Assume RM0.30/kWh
        double fuelCost = (fuelPortion / getMileage()) * fuelPrice;
        
        return electricCost + fuelCost;
    }
    
    // Hybrid-specific methods
    public void changePowerMode(String newMode) {
        this.powerMode = newMode;
        System.out.println("Power mode changed to: " + newMode);
    }
    
    public double calculateTotalRange() {
        return electricRange + (getMileage() * 50); // Assume 50L fuel tank
    }
    
    public String getEnergyUsage(double distance) {
        if (distance <= electricRange) {
            return "Fully electric mode - zero emissions";
        } else {
            double electricPercent = (electricRange / distance) * 100;
            return String.format("Hybrid mode - %.1f%% electric, %.1f%% fuel", electricPercent, 100-electricPercent);
        }
    }
    
    public void demonstrateRegenerativeBraking() {
        if (hasRegenerativeBraking) {
            System.out.println("Regenerative braking active... Charging battery while slowing down!");
        } else {
            System.out.println("Regenerative braking not available");
        }
    }
    
    // Getters and setters
    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }
    
    public int getElectricRange() { return electricRange; }
    public void setElectricRange(int electricRange) { this.electricRange = electricRange; }
    
    public String getHybridType() { return hybridType; }
    public void setHybridType(String hybridType) { this.hybridType = hybridType; }
    
    public boolean hasRegenerativeBraking() { return hasRegenerativeBraking; }
    public void setRegenerativeBraking(boolean hasRegenerativeBraking) { this.hasRegenerativeBraking = hasRegenerativeBraking; }
    
    public String getPowerMode() { return powerMode; }
    public void setPowerMode(String powerMode) { this.powerMode = powerMode; }
}
