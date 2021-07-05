package hw11dk;

public class Mouse {
    private Brands mouse_brand;
    private String mouse_model;
    private Conectype mouse_connect;       // wireless, cable


    public Mouse(Brands mouse_brand, Conectype mouse_connect, String mouse_model) {
        this.mouse_brand = mouse_brand;
        this.mouse_model = mouse_model;
        this.mouse_connect = mouse_connect;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouse_brand=" + mouse_brand +
                ", mouse_model='" + mouse_model + '\'' +
                ", mouse_connect=" + mouse_connect +
                '}';
    }

    public String getMouse_model() {
        return mouse_model;
    }

    public void setMouse_model(String mouse_model) {
        this.mouse_model = mouse_model;
    }

    public Brands getMouse_brand() {
        return mouse_brand;
    }

    public void setMouse_brand(Brands mouse_brand) {
        this.mouse_brand = mouse_brand;
    }

    public Conectype getMouse_connect() {
        return mouse_connect;
    }

    public void setMouse_connect(Conectype mouse_connect) {
        this.mouse_connect = mouse_connect;
    }
}


