package hw10dk;

public class App {
    public static void main(String[] args) {
// Lesson 10 :
//          1. Create a super class and 3 child classes
//             create 2 object of each class (including superclass - don't make it abstract)
//------------------------------------------------------------------------------------------

//new object movie
        Movie joker = new Movie("Joker", 2019, "Steiner Studios");

        //System.out.println(joker.getName());
        System.out.println(joker);

//new object crew
        Crew gcrew = new Crew( "Ghost", 2020, "Steiner Studio","John Kruger",30);
        //
        System.out.println(gcrew);
        // get of super class
        System.out.println(gcrew.getName() + " : " + gcrew.getCrew_da() + " total crew: " + gcrew.crew_quantity);

// new object transpo
        Transpo jtranspo = new Transpo(joker.name, joker.year, joker.getStudio(), "DA. James Crew : ", 42,"Cap. John : ",15);
        System.out.println(jtranspo);

// new object light + used constructor + combined String to  from transpo & light
        Light jlight = new Light(gcrew.name, gcrew.year, gcrew.getStudio(), gcrew.crew_da, gcrew.crew_quantity, "Cap. Godoon",7,"Dean Ruse",11);

        System.out.println(jlight);
        System.out.println((jtranspo) +" + "+ (jlight));


    }
}
