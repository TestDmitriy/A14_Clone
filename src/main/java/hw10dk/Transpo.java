package hw10dk;

public class Transpo extends Crew {

    protected String captain;
    protected int trans_vehicle;

// to String (full version)

    @Override
    public String toString() {
        return "Object Transpo# : " +
                "name = " + name + " : " +
                "year = " + year + " : " +
                "studio = " + studio + " : " +
                "crew_da = " + crew_da + " : " +
                "crew_quantity = " + crew_quantity +
                "Captain = " + captain + " : " +
                "trans_vehicle = " + trans_vehicle +
                " ## ";
    }

// constructor

    public Transpo(String name, int year, String studio, String crew_da, int crew_quantity, String captain, int trans_vehicle) {
        super(name, year, studio, crew_da, crew_quantity);
        this.captain = captain;
        this.trans_vehicle = trans_vehicle;
    }

// getters & setters

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getTrans_vehicle() {
        return trans_vehicle;
    }

    public void setTrans_vehicle(int trans_vehicle) {
        this.trans_vehicle = trans_vehicle;
    }

}
