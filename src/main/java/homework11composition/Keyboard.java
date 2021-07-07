package homework11composition;

public class Keyboard extends Device {
    private boolean isWireless;

    public Keyboard(String brand, String model, Colors color, boolean isWireless) {
        super(brand, model, color);
        this.isWireless = isWireless;
    }

    public Keyboard(String brand, String model, boolean isWireless) {
        super(brand, model);
        this.isWireless = isWireless;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
