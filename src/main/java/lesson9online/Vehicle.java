package lesson9online;

import lesson8oop.Color;

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
        return model;
    }
    public void setYear(int year){
        if(year>2021 || year<2000){
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;
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
}
