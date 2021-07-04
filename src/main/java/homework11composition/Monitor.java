package homework11composition;

public class Monitor extends Device {
    private int size;
    private ScreenType type;

    public Monitor(String brand, String model, Colors color, int size, ScreenType type) {
        super(brand, model, color);
        this.size = size;
        this.type = type;
    }

    public Monitor(String brand, String model, int size, ScreenType type) {
        super(brand, model);
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }
}
