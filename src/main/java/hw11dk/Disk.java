package hw11dk;

public class Disk {
    private Brands disk_brand;          //Enum
    private Disktype disk_type;         //Enum
    private int disk_size;


    public Disk(Brands disk_brand, Disktype disk_type, int disk_size) {
        this.disk_brand = disk_brand;
        this.disk_type = disk_type;
        this.disk_size = disk_size;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "disk_brand =" + disk_brand +
                ", disk_type =" + disk_type +
                ", disk_size =" + disk_size +
                '}';
    }

    public Brands getDisk_brand() {
        return disk_brand;
    }

    public void setDisk_brand(Brands disk_brand) {
        this.disk_brand = disk_brand;
    }

    public Disktype getDisk_type() {
        return disk_type;
    }

    public void setDisk_type(Disktype disk_type) {
        this.disk_type = disk_type;
    }

    public int getDisk_size() {
        return disk_size;
    }

    public void setDisk_size(int disk_size) {
        this.disk_size = disk_size;
    }
}
