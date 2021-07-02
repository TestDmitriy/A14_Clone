package hw10dk;

public class Movie {
    protected String name;
    protected int year;
    protected String studio;


//---------------------------------- to String()
    @Override
    public String toString() {
        return "Movie# " +
                "name: " + name +
                ", year: " + year +
                ", studio: " + studio + '.';
    }

    //--------------------------------Constructor

    public Movie(String name, int year, String studio) {
        this.name = name;
        this.year = year;
        this.studio = studio;
    }

    // ------------------------------- getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
// ----------------------------------------------------end


}
