package lesson9online;

import lesson8oop.Color;

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
