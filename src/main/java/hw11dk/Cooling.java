package hw11dk;

public class Cooling {
    private Brands cool_brand;          //ENUM
    private String cool_model;
    private Coolingtype cool_type;      //ENUM


    public Cooling(Brands cool_brand, String cool_model, Coolingtype cool_type) {
        this.cool_brand = cool_brand;
        this.cool_model = cool_model;
        this.cool_type = cool_type;

    }

    @Override
    public String toString() {
        return "Cooling{" +
                "cool_type=" + cool_brand +
                ", cool_brand=" + cool_model +
                ", cool_model='" + cool_type + '\'' +
                '}';
    }

    public Coolingtype getCool_type() {
        return cool_type;
    }

    public void setCool_type(Coolingtype cool_type) {
        this.cool_type = cool_type;
    }

    public Brands getCool_brand() {
        return cool_brand;
    }

    public void setCool_brand(Brands cool_brand) {
        this.cool_brand = cool_brand;
    }

    public String getCool_model() {
        return cool_model;
    }

    public void setCool_model(String cool_model) {
        this.cool_model = cool_model;
    }
}
