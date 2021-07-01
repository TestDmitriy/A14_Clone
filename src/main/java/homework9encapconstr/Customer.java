package homework9encapconstr;

public class Customer {
    private String name;
    private String lastName;
    private String gender;

    public Customer(String name, String lastName, String gender){
        this.name = name;
        this.lastName = lastName;
        setGender(gender);
    }

    public Customer(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender){
        if (gender=="M" || gender=="m" || gender=="F" || gender=="f" || gender =="Male" || gender=="male" || gender=="Female" || gender=="female") {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Wrong gender");
        }
    }
    public String getGender(){
        return gender;
    }

    public void welcome(){
        if(gender=="M" || gender=="m" || gender=="Male" || gender=="male"){
            System.out.println("Welcome, Mr. "+name+" "+lastName+"!");
        }else{
            System.out.println("Welcome, Ms. "+name+" "+lastName+"!");
        }
    }
}
