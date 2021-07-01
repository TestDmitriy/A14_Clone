package homework9encapconstr;

public class School {
    private String name;
    private String city;
    private int students;

    public School(String name, String city, int students){
        this.name = name;
        this.city = city;
        setStudents(students);
    }

    public School(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    public void setStudents(int students){
        if(students<0){
            throw new IllegalArgumentException("Wrong students quantity");
        }
        this.students = students;
    }
    public int getStudents(){
        return students;
    }

    public void printSchoolInfo(){
        System.out.println(name+" school in "+city+" has a "+students+" students");
    }
}
