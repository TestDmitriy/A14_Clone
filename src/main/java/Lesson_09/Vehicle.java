package Lesson_09;

import Lesson_08.Color;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private Color color;

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setYear(int year){
        if(year>2021 || year<2000){
            throw new IllegalArgumentException("Wrong year passed");
        }
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }

    public void printVehicleInfo(){
        System.out.println("Make = "+make + "\nModel = "+ model + "\nYear = " + year + "\nColor = "+color);
    }
    public void beep(){
        System.out.println(color+" car made beep");
    }

}
