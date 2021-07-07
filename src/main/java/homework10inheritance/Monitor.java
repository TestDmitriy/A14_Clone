package homework10inheritance;

public class Monitor extends Device {
    private int screenSize;

    public Monitor(String make, String model, Colors color, int screenSize) {
        super(make,model,color);
        setScreenSize(screenSize);
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        if(screenSize<21 || screenSize>42){
            throw new IllegalArgumentException("Wrong size");
        }
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Monitor " + make +
                " " + model +
                ", color=" + color +
                ", screensize=" + screenSize;
    }
}
