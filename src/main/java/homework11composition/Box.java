package homework11composition;

public class Box extends Device {
    private int[] size;

    public Box(String brand, String model, Colors color, int[] size) {
        super(brand, model, color);
        this.size = size;
    }

    public Box(String brand, String model, int[] size) {
        super(brand, model);
        this.size = size;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }
}
