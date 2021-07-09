package lesson15;

public class App {
    public static void main(String[] args) {
//        PersonNonStatic person1 = new PersonNonStatic();
//        person1.hello();
//
        PersonStatic.hello();
//
        Person.hello();

        Person person2 = new Person("David");
//        hi();
//        person2.hey();

        Person anna = new Person("Anna");
        Person sam = new Person("Sam");

        anna.setXx("ZZZZZZZZZZZ");

        System.out.println(sam.getXx());

    }

    public static void hi(){
        System.out.println("hi");
    }

}
