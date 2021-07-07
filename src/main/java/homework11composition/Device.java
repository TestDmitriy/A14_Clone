package homework11composition;

// Parent class for all devices, describes base parameters like brand, model and color.

public class Device {
    protected String brand;
    protected String model;
    protected Colors color;

    public Device(String brand, String model, Colors color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Device(String brand, String model) {
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

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
