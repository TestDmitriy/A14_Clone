package Lesson_09_online;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n){

        name = n;
    }
    public String getName(){

        return name;
    }
    public void setLastName(String l){
        lastName = l;
    }
    public String getLastName(){
        return lastName;
    }

    public void setYear(int y){
        if(y>2021 || y<1900){
            throw new IllegalArgumentException("Wrong year");
        }
        year = y;
    }
    public int getYear(){
        return year;
    }
}
