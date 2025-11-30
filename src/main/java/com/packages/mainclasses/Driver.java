package com.packages.mainclasses;

public class Driver {
    private int driverID;
    private String driverName;
    private String driverTeam;

    public Driver(){
        this.driverID = 0;
        this.driverName = "No Entry";
        this.driverTeam = "No Entry";
    }

    public Driver(int driID, String driName, String driTeam){
        this.driverID = driID;
        this.driverName = driName;
        this.driverTeam = driTeam;
    }

    public int getDriverID() { return driverID; }
    public void setDriverID(int DriId) { this.driverID = DriId; }
    
    public String getDriverName() { return driverName; }
    public void setDriverName(String DriName) { this.driverName = DriName; }

    public String getDriverTeam() { return driverTeam; }
    public void setDriverTeam(String DriTeam) { this.driverTeam = DriTeam; }
}
