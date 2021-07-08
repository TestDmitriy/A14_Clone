package Lesson_10;

import Lesson_09a.Subjects;

public class Student extends Person{
    private Subjects major;

    public Student(String name, String lastName, int year, Subjects major) {
        super(name,lastName,year);
        this.major = major;
    }

    public Subjects getMajor() {
        return major;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nlastName=" + lastName + "\nyear=" + year +
                "\nmajor=" + major;
    }
}
