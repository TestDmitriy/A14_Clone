package hw15dk;

import java.util.*;

public class App {
    public static void main(String[] args) {

//-------------------------------------------HOMEWORK #15:
//    +   Create class Hospital Fields
//        - private String hospitalName;
//        - private Address address;

//    +   Class Address
//        - private String streetAddress;
//        - private String town;
//        - private String state;
//        - private int zip;
//        - private List<Doctor> doctors;

//    +   Class Doctor
//        - private String name;
//        - private String lastName;
//        - private Position position;

//    +   Enum Position is a enum with 5 members - for example Position.PHYSICIAN);

//    +   - private Map<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )

//    +   - private List<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
//        (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)

//        Methods (in loop):
//        - Printout hospital with ALL fields
//        - Printout Doctors and their titles; public void printDoctors();
//        - Printout rooms
//----------------------------------------------------------------------------------------------------------------------

        //adding ROOMS
        Map<Integer, Enum> rooms = new HashMap<>();             //i used ENUM with Positions (doc's position displayed on room)
        rooms.put(10,Position.CARDIOLOGY);
        rooms.put(11,Position.FAMILY_MEDICINE);
        rooms.put(12,Position.GENERAL_SURGERY);
        rooms.put(13,Position.PEDIATRICS);
        rooms.put(14,Position.PLASTIC_SURGERY);
        rooms.put(25,Position.PULMONOLOGY);

        //Adding Insur.companies
        ArrayList<Enum> InsuranseCompamies = new ArrayList<>();
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.MADICARE);
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.UNITEDHEALTHCARE);
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.AETNA);
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.AFLIC);
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.CAREPLUS);
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.HEALTHFIRST);
        InsuranseCompamies.add(hw15dk.InsuranseCompamies.HUMANA);

//control
//        System.out.println(rooms);
//        System.out.println(InsuranseCompamies);

        //creating Addresses:
        Address addr1 = new Address("400 Broome St","New York","NY",10013);
        Address addr2 = new Address("1099 2nd Ave","New York","NY",10022);
        Address addr3 = new Address("121 Dekalb Ave","Brooklyn","New York",11201);
        Address addr4 = new Address("2601 Ocean Pkwy", "Brooklyn","NY",11235);

        //creating Hospitals
        Hospital hosp1 = new Hospital("NYU",addr1);
        Hospital hosp2 = new Hospital("First Presbyterian Hospital",addr2);
        Hospital hosp3 = new Hospital("Brooklyn Hospital",addr3);
        Hospital hosp4 = new Hospital("Coney Island Hospital",addr4);


//      - Printout hospital with ALL fields
//      System.out.println(hosp4.getHospitalName() + hosp4.getAddress());
        System.out.println(hosp4);


//      - Printout Doctors and their titles; public void printDoctors();
        //creating doctors
        Doctor doc1 = new Doctor("John","Carter",Position.CARDIOLOGY);
        Doctor doc2 = new Doctor("Rob","Dougan",Position.FAMILY_MEDICINE);
        Doctor doc3 = new Doctor("Nicka", "Spochini", Position.GENERAL_SURGERY);
        Doctor doc4 = new Doctor("David","Wakowsky",Position.PEDIATRICS);
        Doctor doc5 = new Doctor("Rohn", "Hardy", Position.PLASTIC_SURGERY);
        Doctor doc6 = new Doctor("Mery","Johnson",Position.PULMONOLOGY);

        //HashSet
        Set<Doctor> doctors = new HashSet<>();
        doctors.add(doc1);
        doctors.add(doc2);
        doctors.add(doc3);
        doctors.add(doc4);
        doctors.add(doc5);
        doctors.add(doc6);

//      System.out.println(doctors.size());
        //Printout Doctors and their titles
        System.out.println("----------- Printout Doctors and their titles -----------");
        //FOR i
        for (Doctor doc : doctors
             ) {
            System.out.println("Dr. " + doc.getName().charAt(0) +". " + doc.getLastName() +" : " + doc.getPosition());
        }
        //FOREACH:
        doctors.forEach(System.out::println);

        // Function
        // WILL BE SOON !!!


//      - Printout rooms
        System.out.println("----------- Printout rooms -----------");
        System.out.println(rooms.entrySet());
        System.out.println(rooms);

    }
}
