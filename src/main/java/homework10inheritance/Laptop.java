package homework10inheritance;

public class Laptop extends SmartDevice {
    private int screenSize;

    public Laptop(String make, String model, Colors color, Processors processor, int screenSize) {
        super(make, model, color, processor);
        this.screenSize = screenSize;
    }

    public void setSize(int screenSize) {
        if(screenSize<14 || screenSize>17){
            throw new IllegalArgumentException("Wrong screen size");
        }
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Laptop " + make +
                " " + model +
                ", color=" + color +
                ", screenSize=" + screenSize +
                ", processor=" + processor;
    }
}
