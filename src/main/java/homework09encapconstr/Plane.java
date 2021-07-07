package homework09encapconstr;

public class Plane {
    private String make;
    private String model;
    private int passengers;

    public Plane(String make, String model, int passengers){
        this.make = make;
        this.model = model;
        setPassengers(passengers);
    }

    public Plane(){}

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setPassengers(int passengers){
        if(passengers<0 || passengers>605){
            throw new IllegalArgumentException("Wrong students quantity");
        }
        this.passengers = passengers;
    }
    public int getPassengers(){
        return passengers;
    }

    public void welcome(){
        System.out.println("Welcome to aboard of our "+make+" "+model+". You are one of a "+passengers+" passengers today!");
    }
}
