package com.packages.mainclasses;

public class Garage{
    private int garageIdNum;
    private String garageName;
    private String garageLocation;

    public Garage(){
        this.garageIdNum = 0;
        this.garageName = "No Entry";
        this.garageLocation = "No Entry";
    }

    public Garage(int garageNum, String garName){
        this.garageIdNum = garageNum ;
        this.garageName = garName;
        this.garageLocation = "No Entry";
    }

    public int getGarageNum() { return garageIdNum; }
    public void setGarageNum(int garageNum) { this.garageIdNum = garageNum; }
    
    public String getGarageName() { return garageName; }
    public void setGarageName(String garName) { this.garageName = garName; }

    public String getGarageLoc() { return garageLocation; }
    public void setGarageLoc(String garageLoc) { this.garageLocation = garageLoc; }

}
