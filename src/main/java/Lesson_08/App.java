package Lesson_08;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Jonson";
        anna.yearOfBirth = 1999;


//        System.out.println(anna.lastName);

        Person david = new Person();
        david.yearOfBirth = 1995;
        david.name = "David";
        david.lastName = "Roberts";

        Person erik = new Person();
        erik.lastName = "Swensson";
        erik.name = "Erik";
        erik.yearOfBirth = 1985;

        Vehicle myCar = new Vehicle();
        myCar.color = Color.RED;
        myCar.model = "Camry";
        myCar.make = "Toyota";

        myCar.color = Color.PINK;
        myCar.make = "Honda";
        myCar.model = "Accent";

        Fruit apple = new Fruit();
        apple.name = "Golden delicious";
        apple.color = Color.YELLOW;

//        System.out.println(myCar.color);
        myCar.year=2005;

        Vehicle myFriendCar = new Vehicle();
        myFriendCar.year= 2010;
        myFriendCar.color = Color.YELLOW;
        myFriendCar.make = "Ford";
        myFriendCar.model = "Focus";



//        myCar.printVehicleInfo();
//        myFriendCar.printVehicleInfo();
//
//        myCar.beep();
//        myFriendCar.beep();
//

        erik.introduce();
        anna.introduce();
        david.introduce();
    }
}
