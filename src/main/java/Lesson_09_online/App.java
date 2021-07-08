package Lesson_09_online;

import Lesson_08_OOP.Color;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.setName("Anna");
        System.out.println(anna.getName());

        anna.setYear(1983);
        System.out.println(anna.getYear());

        Vehicle my = new Vehicle();
        my.setMake("Toyota");
        my.setYear(2010);
        my.setModel("Tundra");
        my.setColor(Color.YELLOW);
    }
}
