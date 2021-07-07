package homework10inheritance;

public class Device {
    protected String make;
    protected String model;
    protected Colors color;

    public Device(String make, String model, Colors color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Device(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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

    @Override
    public String toString() {
        return "Device " + make +
                " " + model +
                ", color=" + color;
    }
}
