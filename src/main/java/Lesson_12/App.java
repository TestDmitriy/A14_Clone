package Lesson_12;

public class App {
    public static void main(String[] args) {
        String str = "Lesson_00_Hello";

        int d = str.length();
        System.out.println(d);

        char x = str.charAt(1);
        System.out.println(x);

        DesktopLight l1 = new DesktopLight("L1",20);
        UsPlug l2 = new DesktopLight("L2",30);
        UsPlug p1 = new LaserPrinter("HP","C12");

        Person per1 = new Student();
//        Student s1 = new Person();
//        UsPlug us1 = new UsPlug();
    }
}
