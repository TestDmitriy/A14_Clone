package lesson8oop;

public class App1 {
    public static void main(String[] args) {
        Vehicle xx = new Vehicle();
//        xx.beep();
        xx.printVehicleInfo();


        Glasses gucci = new Glasses();
        gucci.leftGlass = 0;
        gucci.rightGlass = 0;
        gucci.shadow = Shadow.DIMMED;
        gucci.brand = "Gucci";
        gucci.model = "L65";

        gucci.printInfo();
    }
}
