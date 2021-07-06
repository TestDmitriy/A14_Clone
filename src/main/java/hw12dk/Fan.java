package hw12dk;

public class Fan extends Heatsink implements Cooling, Air{
    String fans = "Fan";

    @Override
    public void CoolingInterfaces() {
        System.out.println("Cooling Method: " + heatsink +" equipped with "+ fans);

    }

    @Override
    public void AirBlow() {
        String air = "Air DO BLOWING. ";
        System.out.println(air+fans);
    }

//getters&setters
    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
    }
}





