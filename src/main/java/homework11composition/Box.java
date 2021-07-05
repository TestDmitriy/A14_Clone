package homework11composition;

public class Box extends Device {
    private String[] size;

    public Box(String brand, String model, Colors color, String[] size) {
        super(brand, model, color);
        this.size = size;
    }

    public Box(String brand, String model, String[] size) {
        super(brand, model);
        this.size = size;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }
}
