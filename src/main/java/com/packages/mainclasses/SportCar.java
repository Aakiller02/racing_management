package com.packages.mainclasses;

public class SportCar implements VehicleOperations{
    // Attributes
    private String brand;
    private String model;
    private int year;
    private int price;
    private double engineCapacity;
    private String fuelType;
    private double mileage;
    @SuppressWarnings("unused")
    Wheels Tyre = new Wheels();
    @SuppressWarnings("unused")
    Garage Garage = new Garage();
    @SuppressWarnings("unused")
    Driver Driver = new Driver();

    // constructors
    public SportCar() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0;
        this.engineCapacity = 0.0;
        this.fuelType = "Unknown";
        this.mileage = 0.0;
    }

    public SportCar(String brand, String model, int year, int price,
                    double engineCapacity, String fuelType, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }
    
    // Getter and Setter methods
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public double getEngineCapacity() { return engineCapacity; }
    public void setEngineCapacity(double engineCapacity) { this.engineCapacity = engineCapacity; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }

    // Polymorphism interface implementation
    @Override
    public void startVehicle() {
        System.out.println("Sport car engine starting... Vroom Vroom!");
    }
    
    @Override
    public void stopVehicle() {
        System.out.println("Sport car engine shutting down...");
    }
    
    @Override
    public double calculateEfficiency() {
        return mileage; // km per liter for regular cars
    }
    
    @Override
    public String getVehicleStatus() {
        return "Regular sport car - Ready for performance driving";
    }

    @Override
    public String engineType(){
        return "Gas";
    }

    // Common methods that will be overridden in derived classes
    public void displayCarInfo() {
        System.out.println("\n=== CAR INFORMATION ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: RM" + price);
        System.out.println("Engine: " + engineCapacity + "L");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/L");
    }

    public double calculateMaintenanceCost() {
        return price * 0.05; // 5% of car price per year
    }

    public String getCarType() {
        return "Regular Sport Car";
    }

    public void performService() {
        System.out.println("Performing regular maintenance: Oil change, filter replacement, brake check");
    }
    
    public void startEngine() {
        System.out.println("Engine starting... Vroom Vroom!");
    }
    
    public double calculateFuelCost(double distance, double fuelPrice) {
        double fuelNeeded = distance / mileage;
        return fuelNeeded * fuelPrice;
    }

    public int calculateCarAge(int currentYear) {
        return currentYear - year;
    }

    public boolean isFuelEfficient(float fuelUsed, float distanceTravelled) {
        float fuelPer100 = (fuelUsed / distanceTravelled) * 100;
        return fuelPer100 < 7;
    }

    public void resellValue() {
        System.out.println("\nResell Value Estimation");
        System.out.println("This is just an estimation");

        if (year == 1) {
            float depreciateValue = this.price * 15 / 100;
            float carValue = this.price - depreciateValue;
            System.out.println("Based on data, your car value is: RM " + carValue);
        } else if (year == 2) {
            float depreciateValue = this.price * 20 / 100;
            float carValue = this.price - depreciateValue;
            System.out.println("Based on data, your car value is: RM " + carValue);
        } else if (year == 3) {
            float depreciateValue = this.price * 30 / 100;
            float carValue = this.price - depreciateValue;
            System.out.println("Based on data, your car value is: RM " + carValue);
        } else if (year == 4) {
            float depreciateValue = this.price * 40 / 100;
            float carValue = this.price - depreciateValue;
            System.out.println("Based on data, your car value is: RM " + carValue);
        } else if (year >= 5) {
            float depreciateValue = this.price * 50 / 100;
            float carValue = this.price - depreciateValue;
            System.out.println("Based on data, your car value is: RM " + carValue);
        } else {
            System.out.println("Data not completed yet");
        }
    }
}
