package com.packages.mainclasses;

public class Driver {
    private int driverID;
    private String driverName;

    public Driver(){
        this.driverID = 0;
        this.driverName = "No Entry";
    }

    public Driver(int driID, String driName){
        this.driverID = driID;
        this.driverName = driName;
    }

    public int getDriverNum() { return driverID; }
    public void setDriverNum(int DriId) { this.driverID = DriId; }
    
    public String getDriverName() { return driverName; }
    public void setDriverName(String DriName) { this.driverName = DriName; }
}
