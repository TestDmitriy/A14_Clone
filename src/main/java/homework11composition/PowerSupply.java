package homework11composition;

public class PowerSupply extends Device {
    private int power;

        public PowerSupply(String brand, String model, int power) {
        super(brand, model);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
