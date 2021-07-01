package homework9encapconstr;

public class Monitor {
    private String make;
    private String model;
    private int size;

    public Monitor(String make, String model, int size){
        this.make = make;
        this.model = model;
        setSize(size);
    }

    public Monitor(){}

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

    public void setSize(int size){
        if(size<21 || size>42){
            throw new IllegalArgumentException("Wrong size");
        }
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    public void printMonitorInfo(){
        System.out.println("Make: "+make+"\nModel: "+model+"\nSize: "+size+" inch");
    }
}
