package hw11dk;

public class Keyboard {
    private Brands keyb_brand;
    private String model;
    private Conectype keyb_connect;

    //constructor
    public Keyboard(Brands keyb_brand, String model, Conectype connect_keyboard) {
        this.keyb_brand = keyb_brand;
        this.model = model;
        this.keyb_connect = connect_keyboard;
    }

    //getters&setters


    public Brands getKeyb_brand() {
        return keyb_brand;
    }

    public void setKeyb_brand(Brands keyb_brand) {
        this.keyb_brand = keyb_brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Conectype getKeyb_connect() {
        return keyb_connect;
    }

    public void setKeyb_connect(Conectype keyb_connect) {
        this.keyb_connect = keyb_connect;
    }

    //toString
    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + keyb_brand + '\'' +
                ", model='" + model + '\'' +
                ", type of connection='" + keyb_connect + '\'' +
                '}';
    }
}
