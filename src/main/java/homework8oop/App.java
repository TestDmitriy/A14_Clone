package homework8oop;

public class App {
    public static void main(String[] args) {
        // 1.
        Laptop lenovo = new Laptop();
        lenovo.make = "Lenovo";
        lenovo.processor = Processors.AMD;
        lenovo.color = Colors.BLACK;
        lenovo.advertise();

        Customer alex = new Customer();
        alex.name = "Alex";
        alex.lastName = "Crowley";
        alex.gender = Genders.M;
        alex.offer();

        // 2.
        Laptop macbook = new Laptop();
        macbook.make = "Apple MacBook";
        macbook.processor = Processors.APPLE_M1;
        macbook.color = Colors.GOLD;
        macbook.advertise();

        Customer julia = new Customer();
        julia.name = "Julia";
        julia.lastName = "Smith";
        julia.gender = Genders.F;
        julia.offer();

        // 3.
        Smartphone pixel = new Smartphone();
        pixel.make = "Google";
        pixel.model = "Pixel 5";
        pixel.processor = Processors.QUALCOMM;
        pixel.color = Colors.BLACK;
        pixel.smart();

        Accessory cover = new Accessory();
        cover.name = "case";
        cover.color = Colors.NAVY;
        cover.acc();

        //4.
        Smartphone iphone = new Smartphone();
        iphone.make = "Apple";
        iphone.model = "iPhone";
        iphone.processor = Processors.APPLE_M1;
        iphone.color = Colors.GOLD;
        iphone.smart();

        Accessory chrg = new Accessory();
        chrg.name = "fast charger";
        chrg.color = Colors.WIGHT;
        chrg.acc();

    }
}
