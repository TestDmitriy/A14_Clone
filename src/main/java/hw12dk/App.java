package hw12dk;

public class App {
    public static void main(String[] args) {

        // 1. Create an interface and 2 classes which implements it (2 interfaces, 3 classes)
        // 2. Create 2 objects of each class (3 objects)
        // 3. Assign one object to interface type (assigned)

        Heatsink hs1 = new Heatsink();
        hs1.CoolingInterfaces();

        Fan fan1 = new Fan();
        fan1.CoolingInterfaces();

        Liquid liquid1 = new Liquid();
        liquid1.CoolingInterfaces();


//added additional Interface (Air) for practice
// used Inheritance Heatsink -> fans -> Liquid
        Heatsink hs2 = new Heatsink();
        hs2.AirBlow();

        Fan fan2 = new Fan();
        fan2.AirBlow();



    }
}
