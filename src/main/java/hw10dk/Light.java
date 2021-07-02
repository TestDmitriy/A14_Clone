package hw10dk;

public final class Light extends Transpo {

    private  String light_head;
    private  int light_equipment;

// to string (short)

    @Override
    public String toString() {
        return "Light dep: " + "light_head = " + light_head + ": light_equipment= " + light_equipment + " end";
    }

// constructor by DEFAULT:

    public Light(String name, int year, String studio, String crew_da, int crew_quantity, String captain, int trans_vehicle, String light_head, int light_equipment) {
        super(name, year, studio, crew_da, crew_quantity, captain, trans_vehicle);
        this.light_head = light_head;
        this.light_equipment = light_equipment;
    }


// setters & getters

    public String getLight_head() {
        return light_head;
    }

    public void setLight_head(String light_head) {
        this.light_head = light_head;
    }

    public int getLight_equipment() {
        return light_equipment;
    }

    public void setLight_equipment(int light_equipment) {
        this.light_equipment = light_equipment;
    }
}
