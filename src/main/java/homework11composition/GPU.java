package homework11composition;

public class GPU extends Device {
    private int tFlops;
    private boolean isRTX;

    public GPU(String brand, String model, Colors color, int tFlops, boolean isRTX) {
        super(brand, model, color);
        this.tFlops = tFlops;
        this.isRTX = isRTX;
    }

    public GPU(String brand, String model, int tFlops, boolean isRTX) {
        super(brand, model);
        this.tFlops = tFlops;
        this.isRTX = isRTX;
    }

    public int gettFlops() {
        return tFlops;
    }

    public void settFlops(int tFlops) {
        this.tFlops = tFlops;
    }

    public boolean isRTX() {
        return isRTX;
    }

    public void setRTX(boolean RTX) {
        isRTX = RTX;
    }
}
