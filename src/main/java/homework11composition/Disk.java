package homework11composition;

public class Disk extends Device {
    private int capacity;
    private DiskType type;

    public Disk(String brand, String model, int capacity, DiskType type) {
        super(brand, model);
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }
}
