package Lesson_13;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        a = 10;

        System.out.println("b="+b);

        Person x = new Person("David");
        Person y = x;

        x.setName("Robert");

        System.out.println(y.getName());
    }
}
