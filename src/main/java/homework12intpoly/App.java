package homework12intpoly;

//  Create an interface and 2 classes which implements it
//  Create 2 objects of each class
//  Assign one object to interface type

public class App {
    public static void main(String[] args) {
        Smartphone pixel = new Smartphone("Google Pixel",4,7);
        Smartphone iphone = new Smartphone("Apple Iphone",3,5);
        SmartWatch ticwhatch = new SmartWatch("TicWatch 4",1.15);
        SmartWatch fossil = new SmartWatch("Fossil W1", 1.2);
        Screen samsp = new Smartphone("Samsung Note",4.5,6.3);
        Screen samsw = new SmartWatch("Samsung GearWatch", 1.4);

        Screen[] screens = {pixel,iphone,ticwhatch,fossil,samsp,samsw};
        for (Screen screen : screens){
            screen.write();
            printInfo(screen);
        }
    }
    public static void printInfo(Screen xx){
        System.out.println("Diagonal = "+xx.getDiagonal());
    }
}
