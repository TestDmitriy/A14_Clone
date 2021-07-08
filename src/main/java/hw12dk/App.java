package hw12dk;

public class App {
    public static void main(String[] args) {

        // 1. Create an interface and 2 classes which implements it (2 interfaces, 3 classes)
        // 2. Create 2 objects of each class (3 objects)
        // 3. Assign one object to interface type (assigned)


        // 1st Class: Heatsink
        String heatsinkstr = "Heat Sink";

        Heatsinks newhs1 = new Heatsinks(heatsinkstr);
        newhs1.CoolingInterfaces();

        // 2nd Class: Fans
        String fanstr = "Fans";
        Fans newfan1 = new Fans(fanstr);
        newfan1.CoolingInterfaces();

        // 3rd Class: Liquid
        String liqstr = "Water cooled";

        Liquid newliq1 = new Liquid("140 mm",liqstr);
        newliq1.CoolingInterfaces();



//Interface - Air for practice
//used Inheritance Classes: Fans -> Liquid

        newhs1.AirBlow();
        newfan1.AirBlow();
        newliq1.AirBlow();


// tests
        Fans newLiqTest1 = new Liquid("2x120mm","Radiator");
        Cooling coolTest = new Fans("newFan");


    }
}
// https://www.youtube.com/watch?v=GhslBwrRsnw