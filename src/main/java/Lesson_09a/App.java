package Lesson_09a;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Peterson",1989);
        Person david = new Person();
        Person john = new Person("John","Andersen");
        john.setYear(1987);

        Student alex = new Student("Alex","Smith",1999,Subjects.BIOLOGY);
        alex.printInfo();
    }
}
