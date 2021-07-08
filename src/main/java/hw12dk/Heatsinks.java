package hw12dk;

public class Heatsinks implements Cooling, Air {
    private String heatsinkstr;


    @Override
    public void AirBlow() {
        System.out.println("HEATSINK : Natural dispersion");
    }

    @Override
    public void CoolingInterfaces(){
        System.out.println(heatsinkstr);
    }

    public Heatsinks(String heatsinkstr) {
        this.heatsinkstr = heatsinkstr;
    }

    public String getHeatsinkstr() {
        return heatsinkstr;
    }

    public void setHeatsinkstr(String heatsinkstr) {
        this.heatsinkstr = heatsinkstr;
    }
}
