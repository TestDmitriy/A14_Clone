package lesson9a;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        setYear(year);
    }
    public Person(){}
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setYear(int y){
        if(y>2021 || y<1900){
            throw new IllegalArgumentException("Wrong year");
        }
        year=y;
    }
}
