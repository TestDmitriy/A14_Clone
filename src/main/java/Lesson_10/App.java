package Lesson_10;

import Lesson_09a.Subjects;

public class App {
    public static void main(String[] args) {

        Student anna = new Student("Anna","Wilson",1999, Subjects.ACCOUNTING);
        Teacher mrJones = new Teacher("Alan","Jones",1978,Subjects.CHEMISTRY);

//        System.out.println(anna);
//        System.out.println(mrJones);

        System.out.println(anna.getLastName());

        String name = new String("Anna");

    }
}
