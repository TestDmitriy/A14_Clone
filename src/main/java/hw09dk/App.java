package hw09dk;

public class App {
    public static void main(String[] args) {

// HOMEWORK #1: CREAT CLASSES AND CONSTRUCTOR (DEFAULT, FULL-DEDICATED FIELDS)

// Constructor - default / Creating 1st instance

        Mobo build0 = new Mobo();
        build0.brand = "EVGA";
        build0.name = "Black";
        build0.formation = "eATX";


        System.out.println("1a: Created by Default Constructor: " + "\n" + build0.brand);
        build0.setBrand("PNY");
        build0.setPrice(357);
        System.out.println(build0.getFormation() + " : " + build0.getPrice());


        // Constructor - Full / dedicated fields  / Creating 2nd instance

        Mobo build1 = new Mobo("Asrock", "Taichi", "ATX");

        System.out.println("1b. Created by Full Constructor: " + "\n" + build1.getBuyer() + build1.brand + " price: " + build1.getPrice());


// new Method printClass:

        build0.printClass();
        build1.printClass();

        Mobo build3 = new Mobo("Gigabyte", "Vision", "ITX");

        build3.printClass();

        build3.setOwner("Dima", 321);
        build0.setOwner("Kevin", 909);


//--------------------------------------------- Methods for Fans class

        Fans freezer1 = new Fans();
        freezer1.printFan("Noctua", 120, "PWM");

        Fans freezer2 = new Fans();
        freezer2.setF_brand("Arctic");
        freezer2.setF_size(140);
        freezer2.setF_cable("3PIN");

        freezer2.printFan(freezer2.getF_brand(), freezer2.getF_size(), freezer2.getF_cable());

        Fans freezer3 = new Fans();
        freezer3.printInfo();

//---------------------------------------------------------------------------

    }
}
