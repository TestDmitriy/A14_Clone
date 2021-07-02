package hw10dk;

public class Crew extends Movie {

    protected String crew_da;
    protected int crew_quantity;

// to string
    @Override
    public String toString() {
        return "Movie# " + name + ", year= " + year +
                ", studio = " + studio +
                ": Crew# " + " crew_da = " + crew_da + " crew_quantity = " + crew_quantity +
                "##";
    }

//geters & setters

    public String getCrew_da() {
        return crew_da;
    }

    public void setCrew_da(String crew_da) {
        this.crew_da = crew_da;
    }

    public int getCrew_quantity() {
        return crew_quantity;
    }

    public void setCrew_quantity(int crew_quantity) {
        this.crew_quantity = crew_quantity;
    }

//constructor

    public Crew(String name, int year, String studio, String crew_da, int crew_quantity) {
        super(name, year, studio);
        this.crew_da = crew_da;
        this.crew_quantity = crew_quantity;
    }
}
