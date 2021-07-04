package homework11composition;

public class RAM extends Device {
    private int capacity;

    public RAM(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
