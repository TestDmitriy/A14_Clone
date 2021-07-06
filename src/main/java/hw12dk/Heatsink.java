package hw12dk;

public class Heatsink implements Cooling, Air{
    String heatsink = "Heat sink";

    @Override
    public void CoolingInterfaces() {
        System.out.println("Cooling Method: " + heatsink);
    }


    @Override
    public void AirBlow() {
        String air = "Air DOESN'T BLOW. ";
        System.out.println(air + heatsink);
    }


//getters&setters----------------------------------------

    public String getHeatsink() {
        return heatsink;
    }

    public void setHeatsink(String heatsink) {
        this.heatsink = heatsink;
    }
}