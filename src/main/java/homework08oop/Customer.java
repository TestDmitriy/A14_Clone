package homework08oop;

public class Customer {
    public String name;
    public String lastName;
    public Genders gender;

    public void offer(){
        if (gender == Genders.M){
            System.out.println("This laptop is the best choice for you, mr. "+name+" "+this.lastName+"!");
        }else{
            System.out.println("This laptop is the best choice for you, ms. "+name+" "+this.lastName+"!");
        }
    }
}
