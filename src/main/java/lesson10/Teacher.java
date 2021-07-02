package lesson10;

import lesson9a.Subjects;

public /*final*/ class Teacher extends Person{
    protected Subjects subject;

    public Teacher(String name, String lastName, int year, Subjects subject) {
        super(name,lastName,year);
        this.subject = subject;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public String toString(){
        return "This is restricted info";
    }
}
