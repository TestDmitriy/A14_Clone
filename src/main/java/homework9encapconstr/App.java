package homework9encapconstr;

//  1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//  each class has at least 2 constructors (default and full)
//  create printClass()/ printInfo() method to print out all fields
//  fields are private
//  each field has getter and setter

//  2. In the App class create main() and create 2 instances of each class;
//  one instance created used default constructor - fill up fields using setter
//  second object created using full constructor
//  print object info using print-out method

public class App {
    public static void main(String[] args) {
        // 1.
        System.out.println("1.");
        Monitor lenovo = new Monitor();
        lenovo.setMake("Lenovo");
        lenovo.setModel("24LQ");
        lenovo.setSize(24);
        lenovo.printMonitorInfo();

        Monitor apple = new Monitor("Samsung", "QS27", 27);
        apple.printMonitorInfo();

        // 2.
        System.out.println("\n2.");
        Customer alex = new Customer();
        alex.setName("Alex");
        alex.setLastName("Crowley");
        alex.setGender("m");
        alex.welcome();

        Customer julia = new Customer("Julia", "Smith", "female");
        julia.welcome();

        // 3.
        System.out.println("\n3.");
        School testpro = new School();
        testpro.setName("Test Pro");
        testpro.setCity("Los Angeles");
        testpro.setStudents(460);
        testpro.printSchoolInfo();

        School portnov = new School("Portnov", "San Francisco Bay Area", 395);
        portnov.printSchoolInfo();

        // 4.
        System.out.println("\n4.");
        Plane boeing = new Plane();
        boeing.setMake("Boeing");
        boeing.setModel("747MAX");
        boeing.setPassengers(583);
        boeing.welcome();

        Plane airbus = new Plane("Airbus","A320",432);
        airbus.welcome();
    }
}
