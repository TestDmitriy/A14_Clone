package lesson9a;

public class Student {
    private String name;
    private String lastName;
    private int year;
    private Subjects major;

    public Student(String name, String lastName, int year, Subjects major){
        this.lastName=lastName;
        this.name=name;
        this.major=major;
        this.year=year;
    }
    public void printInfo(){
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", major=" + major +
                '}');
    }

}
