package hw12dk;

public class Liquid extends Fan implements Cooling{
    String Liquid = "Water in Radiator";


    @Override
    public void CoolingInterfaces() {
        System.out.println("Cooling Method: " + Liquid +" comes with "+ fans);
    }

    @Override
    public void AirBlow() {
        super.AirBlow();
    }

// getters&setters
    public String getLiquid() {
        return Liquid;
    }

    public void setLiquid(String liquid) {
        Liquid = liquid;
    }
}
