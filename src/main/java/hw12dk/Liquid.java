package hw12dk;

public class Liquid extends Fan implements Cooling{
    String Liquid = "Water in Radiator";


    @Override
    public void CoolingInterfaces() {
        System.out.println("Cooling Method: " + Liquid +" comes with "+ fans);
    }
}
