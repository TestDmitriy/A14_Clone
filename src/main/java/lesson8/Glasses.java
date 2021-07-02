package lesson8;

public class Glasses {
    public String brand;
    public String model;
    public Shadow shadow;
    public double leftGlass;
    public double rightGlass;

    public void printInfo(){

        System.out.println("Glasses{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", shadow=" + shadow +
                ", leftGlass=" + leftGlass +
                ", rightGlass=" + rightGlass +
                '}');
    }

}
