package homework10inheritance;

//  1. Create a super class and 3 child classes
//  create 2 object of each class (including superclass - don't make it abstract)

public class App {
    public static void main(String[] args) {
        // 1. Device - parent class for all classes
        System.out.println("1. Device - parent class for all classes");
        Device logi = new Device("Logitec","MX KEYS",Colors.gray);
        Device avaya = new Device("Avaya", "Office Phone");
        System.out.println(logi);
        System.out.println(avaya);

        // 2. Monitor - child class for Device
        System.out.println("\n2. Monitor - child class for Device");
        Monitor lenovom = new Monitor("Lenovo","XL24",Colors.black,24);
        Monitor samsung = new Monitor("Samsung","27PQ",Colors.black,27);
        System.out.println(lenovom);
        System.out.println(samsung);

        // 3. SmartDevice - child class for Devices and parent for Laptop and Smartphones
        System.out.println("\n3. SmartDevice - child class for Devices and parent for Laptop and Smartphones");
        SmartDevice thermostat = new SmartDevice("Nest","Thermostat",Colors.silver,Processors.Mediatec);
        SmartDevice speaker = new SmartDevice("JBL","Link",Colors.navy);
        System.out.println(thermostat);
        System.out.println(speaker);

        // 4. Laptop - child class for SmartDevices
        System.out.println("\n4. Laptop - child class for SmartDevices");
        Laptop lenovol = new Laptop("Lenovo","Yoga 930",Colors.silver,Processors.Intel,18);
        Laptop macbook = new Laptop("Apple","Macbook Pro 16",Colors.gold,Processors.Apple_M,16);
        System.out.println(lenovol);
        System.out.println(macbook);

        // 5. Smartphone - child class for SmartDevices
        System.out.println("\n5. Smartphone - child class for SmartDevices");
        Smartphone pixel = new Smartphone("Google","Pixel 5",Colors.white,Processors.Qualcomm,OS.Android);
        Smartphone iphone = new Smartphone("Apple","iPhone 13 Pro",Colors.navy,Processors.Apple_M,OS.iOS);
        System.out.println(pixel);
        System.out.println(iphone);
    }
}
