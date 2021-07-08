package Lesson_12;

public class LaserPrinter implements UsPlug{
    private String brand;
    private String model;

    public LaserPrinter(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void usPlugStandard() {
        System.out.println("Hello, Im printer");
        System.out.println("I have US electrical plug");
    }
}
