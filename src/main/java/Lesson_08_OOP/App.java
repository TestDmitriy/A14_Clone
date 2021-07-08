package Lesson_08_OOP;

public class App {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex";
        alex.lastName = "Corax";
        alex.yearOfBirth = 1983;
        System.out.println(alex.lastName);

        Person david = new Person();
        david.yearOfBirth = 1995;
        david.name = "David";
        david.lastName = "Roberts";

        Person erik = new Person ();
        erik.lastName = "Lee";
        erik.name = "Erik";
        erik.yearOfBirth = 1985;

        Vehicle myCar = new Vehicle();
        myCar.color = Color.SILVER;
        myCar.model = "Tucson";
        myCar.make = "Hyundai";

        myCar.color = Color.PINK;
        myCar.make = "Honda";
        myCar.model = "Accent";

        Fruit apple = new Fruit();
        apple.name = "Golden delicios";
        apple.color = Color.YELLOW;

        Vehicle myFriendCar = new Vehicle();
        myFriendCar.year = 2010;
        myFriendCar.color = Color.YELLOW;
        myFriendCar.make = "Ford";
        myFriendCar.model = "Focus";




        erik.introduce();
        alex.introduce();
        david.introduce();
    }
}
