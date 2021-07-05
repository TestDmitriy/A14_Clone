package hw11dk;

import javax.management.monitor.MonitorSettingException;

public class Monitor {
    private Brands mon_brand;
    private String mon_model;
    private Montypes mon_type;  //type of panel
    private Sizemon mon_size;   // diagonal

    //constructor
    public Monitor(Brands mon_brand, String mon_model, Montypes mon_type, Sizemon mon_size) {
        this.mon_brand = mon_brand;
        this.mon_model = mon_model;
        this.mon_type = mon_type;
        this.mon_size = mon_size;
    }

    //toString
    @Override
    public String toString() {
        return "Monitor{" +
                "mon_brand=" + mon_brand +
                ", mon_model='" + mon_model + '\'' +
                ", mon_type=" + mon_type +
                ", mon_size=" + mon_size +
                '}';
    }

    //getters&setters
    public Brands getMon_brand() {
        return mon_brand;
    }

    public void setMon_brand(Brands mon_brand) {
        this.mon_brand = mon_brand;
    }

    public String getMon_model() {
        return mon_model;
    }

    public void setMon_model(String mon_model) {
        this.mon_model = mon_model;
    }

    public Montypes getMon_type() {
        return mon_type;
    }

    public void setMon_type(Montypes mon_type) {
        this.mon_type = mon_type;
    }

    public Sizemon getMon_size() {
        return mon_size;
    }

    public void setMon_size(Sizemon mon_size) {
        this.mon_size = mon_size;
    }
}
