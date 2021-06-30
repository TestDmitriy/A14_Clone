package lesson8;

import java.time.Year;

public class Vehicle {
    public String make;
    public String model;
    public int year;
    public Color color;
    public void printVehicleInfo(){
        System.out.println("Make = "+make + "\nModel = "+ model + "\nYear = " + year + "\nColor = "+color);
    }
    public void beep(){
        System.out.println(color+" car made beep");
    }
}
