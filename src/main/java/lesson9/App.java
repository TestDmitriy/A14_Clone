package lesson9;

import lesson8.Color;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.setName("Anna");
        System.out.println(anna.getName());

        anna.setYear(2020);
        System.out.println(anna.getYear());

        Vehicle my = new Vehicle();
        my.setMake("Toyota");
        my.setYear(2010);
        my.setModel("Yaris");
        my.setColor(Color.YELLOW);


        my.beep();
        my.printVehicleInfo();



    }
}
