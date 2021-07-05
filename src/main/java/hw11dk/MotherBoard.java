package hw11dk;

public class MotherBoard {
    private Brands mobo_brand;          // ENUM
    private String mobo_model;
    private Moboserie mobo_serie;       // ENUM
    private Moboformat mobo_format;     // ENUM
    private Socket mobo_socket;          // ENUM


    public MotherBoard(Brands mobo_brand, String mobo_model, Moboserie mobo_serie, Moboformat mobo_format,Socket mobo_socket) {
        this.mobo_brand = mobo_brand;
        this.mobo_model = mobo_model;
        this.mobo_serie = mobo_serie;
        this.mobo_format = mobo_format;
        this.mobo_socket = mobo_socket;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "mobo_brand = " + mobo_brand +
                ", mobo_model = '" + mobo_model + '\'' +
                ", mobo_serie = " + mobo_serie +
                ", mobo_format =" + mobo_format +
                ", mobo_socket = " + mobo_socket +
                '}';
    }

    public Brands getMobo_brand() {
        return mobo_brand;
    }

    public void setMobo_brand(Brands mobo_brand) {
        this.mobo_brand = mobo_brand;
    }

    public String getMobo_model() {
        return mobo_model;
    }

    public void setMobo_model(String mobo_model) {
        this.mobo_model = mobo_model;
    }

    public Moboserie getMobo_serie() {
        return mobo_serie;
    }

    public void setMobo_serie(Moboserie mobo_serie) {
        this.mobo_serie = mobo_serie;
    }

    public Moboformat getMobo_format() {
        return mobo_format;
    }

    public void setMobo_format(Moboformat mobo_format) {
        this.mobo_format = mobo_format;
    }

    public Socket getMobo_socket() {        return mobo_socket;    }

    public void setMobo_socket(Socket mobo_socket) {        this.mobo_socket = mobo_socket;    }
}
