package com.packages.mainclasses;

public class Wheels {
    private String frontTyreType;
    private String backTyreType;

    public Wheels(){
        this.frontTyreType = "Unknown";
        this.backTyreType = "Unknown";
    }

    public Wheels(String frontType, String backType){
        this.frontTyreType = frontType;
        this.backTyreType = backType;
    }

    public String getFrontWheel() {return frontTyreType; }
    public void setFrontWheel(String frontTyre) { this.frontTyreType = frontTyre; }
    
    public String getRearWheel() {return backTyreType; }
    public void setRearWheel(String backTyre) { this.backTyreType = backTyre; }
}
