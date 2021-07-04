package homework11composition;

public class GPU extends Device {
    private boolean isRTX;

    public GPU(String brand, String model, Colors color, boolean isRTX) {
        super(brand, model, color);
        this.isRTX = isRTX;
    }

    public GPU(String brand, String model, boolean isRTX) {
        super(brand, model);
        this.isRTX = isRTX;
    }

    public boolean isRTX() {
        return isRTX;
    }

    public void setRTX(boolean RTX) {
        isRTX = RTX;
    }
}
