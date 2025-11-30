package com.packages.mainclasses;

public class Garage{
    private int garageIdNum;
    private String garageName;

    public Garage(){
        this.garageIdNum = 0;
        this.garageName = "No Entry";
    }

    public Garage(int garageNum, String garName){
        this.garageIdNum = garageNum ;
        this.garageName = garName;
    }

    public int getGarageNum() { return garageIdNum; }
    public void setGarageNum(int garageNum) { this.garageIdNum = garageNum; }
    
    public String getGarageName() { return garageName; }
    public void setGarageName(String garName) { this.garageName = garName; }

}
