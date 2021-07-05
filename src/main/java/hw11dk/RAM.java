package hw11dk;

public class RAM {
    private Brands ram_brand;           //Enum
    private String ram_name;
    private Ramcapacity ram_capacity;   //Enum


    public RAM(Brands ram_brand, String ram_name, Ramcapacity ram_capacity) {
        this.ram_brand = ram_brand;
        this.ram_name = ram_name;
        this.ram_capacity = ram_capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ram_brand=" + ram_brand +
                ", ram_name='" + ram_name + '\'' +
                ", ram_capacity=" + ram_capacity +
                '}';
    }

    public Brands getRam_brand() {
        return ram_brand;
    }

    public void setRam_brand(Brands ram_brand) {
        this.ram_brand = ram_brand;
    }

    public String getRam_name() {
        return ram_name;
    }

    public void setRam_name(String ram_name) {
        this.ram_name = ram_name;
    }

    public Ramcapacity getRam_capacity() {
        return ram_capacity;
    }

    public void setRam_capacity(Ramcapacity ram_capacity) {
        this.ram_capacity = ram_capacity;
    }
}
