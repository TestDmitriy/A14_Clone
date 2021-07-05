package hw11dk;

public class PowerSupply {
    private Brands psu_brand;               // EMUN
    private String psu_name;
    private Psuformfactor psu_formfactor;   // EMUN
    private Psucables psu_cables;           // EMUN
    private Efficiency psu_efficiency;      // EMUN
    private Voltage psu_voltage;            // EMUN


    public PowerSupply(Brands psu_brand, String psu_name, Psuformfactor psu_formfactor, Psucables psu_cables, Efficiency psu_efficiency, Voltage psu_voltage) {
        this.psu_brand = psu_brand;
        this.psu_name = psu_name;
        this.psu_formfactor = psu_formfactor;
        this.psu_cables = psu_cables;
        this.psu_efficiency = psu_efficiency;
        this.psu_voltage = psu_voltage;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "psu_brand=" + psu_brand +
                ", psu_name='" + psu_name + '\'' +
                ", psu_formfactor=" + psu_formfactor +
                ", psu_cables=" + psu_cables +
                ", psu_efficiency=" + psu_efficiency +
                ", psu_voltage=" + psu_voltage +
                '}';
    }

    public Brands getPsu_brand() {
        return psu_brand;
    }

    public void setPsu_brand(Brands psu_brand) {
        this.psu_brand = psu_brand;
    }

    public String getPsu_name() {
        return psu_name;
    }

    public void setPsu_name(String psu_name) {
        this.psu_name = psu_name;
    }

    public Psuformfactor getPsu_formfactor() {
        return psu_formfactor;
    }

    public void setPsu_formfactor(Psuformfactor psu_formfactor) {
        this.psu_formfactor = psu_formfactor;
    }

    public Psucables getPsu_cables() {
        return psu_cables;
    }

    public void setPsu_cables(Psucables psu_cables) {
        this.psu_cables = psu_cables;
    }

    public Efficiency getPsu_efficiency() {
        return psu_efficiency;
    }

    public void setPsu_efficiency(Efficiency psu_efficiency) {
        this.psu_efficiency = psu_efficiency;
    }

    public Voltage getPsu_voltage() {
        return psu_voltage;
    }

    public void setPsu_voltage(Voltage psu_voltage) {
        this.psu_voltage = psu_voltage;
    }
}
