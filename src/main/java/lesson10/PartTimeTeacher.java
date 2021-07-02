package lesson10;

import lesson9a.Subjects;

public class PartTimeTeacher extends Teacher{
    private String schedule;
    public PartTimeTeacher(String name, String lastName, int year, Subjects subject, String schedule) {
        super(name, lastName, year, subject);
        this.schedule = schedule;
    }
}
