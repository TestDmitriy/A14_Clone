package homework10inheritance;

//  1. Create a super class and 3 child classes
//  create 2 object of each class (including superclass - don't make it abstract)

public class App {
    public static void main(String[] args) {
        // 1. Device - parent class for all classes
        System.out.println("1. Device - parent class for all classes");
        Device logi = new Device("Logitec","MX KEYS", Colors.GRAY);
        Device avaya = new Device("Avaya", "Office Phone", Colors.BLACK);
        System.out.println(logi);
        System.out.println(avaya);

        // 2. Monitor - child class for Device
        System.out.println("\n2. Monitor - child class for Device");
        Monitor lenovom = new Monitor("Lenovo","XL24", Colors.BLACK,24);
        Monitor samsung = new Monitor("Samsung","27PQ", Colors.BLACK,27);
        System.out.println(lenovom);
        System.out.println(samsung);

        // 3. SmartDevice - child class for Devices and parent for Laptop and Smartphones
        System.out.println("\n3. SmartDevice - child class for Devices and parent for Laptop and Smartphones");
        SmartDevice thermostat = new SmartDevice("Nest","Thermostat", Colors.SILVER, Processors.MEDIATEC);
        SmartDevice speaker = new SmartDevice("JBL","Link", Colors.NAVY);
        System.out.println(thermostat);
        System.out.println(speaker);

        // 4. Laptop - child class for SmartDevices
        System.out.println("\n4. Laptop - child class for SmartDevices");
        Laptop lenovol = new Laptop("Lenovo","Yoga 930", Colors.SILVER, Processors.INTEL,18);
        Laptop macbook = new Laptop("Apple","Macbook Pro 16", Colors.GOLD, Processors.APPLE_M,16);
        System.out.println(lenovol);
        System.out.println(macbook);

        // 5. Smartphone - child class for SmartDevices
        System.out.println("\n5. Smartphone - child class for SmartDevices");
        Smartphone pixel = new Smartphone("Google","Pixel 5", Colors.WHITE, Processors.QUALCOMM, OS.ANDROID);
        Smartphone iphone = new Smartphone("Apple","iPhone 13 Pro", Colors.NAVY, Processors.APPLE_M, OS.IOS);
        System.out.println(pixel);
        System.out.println(iphone);
    }
}
