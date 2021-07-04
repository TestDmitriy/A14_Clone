package homework11composition;

public class CPU extends Device {
    private double MHz;

    public CPU(String brand, String model, double MHz) {
        super(brand, model);
        this.MHz = MHz;
    }

    public double getMHz() {
        return MHz;
    }

    public void setMHz(double MHz) {
        this.MHz = MHz;
    }
}
