package hw11dk;

public class Videoadapter {
    private Brands video_brand;             //Enum
    private Nvidiachipset video_chipset;    //Enum
    private String video_partnumber;
    private Coolingtype video_cooltype;     //Enum


    public Videoadapter(Brands video_brand, Nvidiachipset video_chipset, String video_partnumber, Coolingtype video_cooltype) {
        this.video_brand = video_brand;
        this.video_chipset = video_chipset;
        this.video_partnumber = video_partnumber;
        this.video_cooltype = video_cooltype;
    }

    @Override
    public String toString() {
        return "Videoadapter{" +
                "video_brand=" + video_brand +
                ", video_chipset=" + video_chipset +
                ", video_partnumber='" + video_partnumber + '\'' +
                ", video_cooltype=" + video_cooltype +
                '}';
    }

    public Brands getVideo_brand() {
        return video_brand;
    }

    public void setVideo_brand(Brands video_brand) {
        this.video_brand = video_brand;
    }

    public Nvidiachipset getVideo_chipset() {
        return video_chipset;
    }

    public void setVideo_chipset(Nvidiachipset video_chipset) {
        this.video_chipset = video_chipset;
    }

    public String getVideo_partnumber() {
        return video_partnumber;
    }

    public void setVideo_partnumber(String video_partnumber) {
        this.video_partnumber = video_partnumber;
    }

    public Coolingtype getVideo_cooltype() {
        return video_cooltype;
    }

    public void setVideo_cooltype(Coolingtype video_cooltype) {
        this.video_cooltype = video_cooltype;
    }
}
