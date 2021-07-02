package hw09dk;

public class Fans {

    private String f_brand;
    private int f_size;
    private String f_cable;

    public Fans(){}

    public Fans(String f_brand, int f_size, String f_cable) {
        this.f_brand = f_brand;
        this.f_size = f_size;
        this.f_cable = f_cable;
    }

    // ----------------------------------Getters & Setters

    public String getF_brand() {
        return f_brand;
    }

    public void setF_brand(String f_brand) {
        this.f_brand = f_brand;
    }

    public int getF_size() {
        return f_size;
    }

    public void setF_size(int f_size) {
        this.f_size = f_size;
    }

    public String getF_cable() {
        return f_cable;
    }

    public void setF_cable(String f_cable) {
        this.f_cable = f_cable;
    }
// ----------------------------------------------------------

    public void printFan(String f_brand, int f_size, String f_cable)
{
    System.out.println(f_brand +" : "+ f_size +" : "+ f_cable);

}
    public void printInfo(){
        System.out.println(getF_brand());
    }


}
