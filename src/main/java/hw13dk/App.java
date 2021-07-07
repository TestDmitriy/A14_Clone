package hw13dk;

import hw11dk.CPU;

import java.util.ArrayList;
import java.util.List;

public class App {
    @Override
    public String toString() {
        return "Enum*";
    }

    public static void main(String[] args) {

//    Create 3 ArrayList - String, Integer and some Custom class
//    Add 4+ elements to each List
//    excersize methods add/set/remove/get/foreach and etc

//1. Creating array + manually adding Strings values + printOut

        ArrayList<String> ArrCpu = new ArrayList<>();
        ArrCpu.add("i3");
        ArrCpu.add("i79");
        System.out.println("New " +ArrCpu.size()+ " values has been added to Array of " + ArrCpu);

// clear Array + Add values from Emun to "Clean" Array + printOut

        ArrCpu.clear();

            for (Cpuseries cc : Cpuseries.values()) {
                System.out.println("from EMUN: " + cc);
                ArrCpu.add(cc.name());
            }
            System.out.println("Array from ENUMS values: " + ArrCpu);


// GET Method for value Index[5] + printOut
        System.out.println(ArrCpu.get(5));          //ATOM

// Size of Array + printOut
        System.out.println("Length of Array: " +ArrCpu.size());          // 13

// ADD Method: Adding new value, index[4]
        ArrCpu.add(4,"XEON X");                     //
        System.out.println("Value with Index[4] " +"'"+ ArrCpu.get(4) +"'"+ " added.");

// PrintOut: size + New Last version of Array
        System.out.println("New size of Array: " + ArrCpu.size());
        for (String dd : ArrCpu){System.out.println("Last Array: " + dd);}

// SET Method
        ArrCpu.set(3,"i9_EXTREME");
        System.out.println(ArrCpu);                 // use to String

    }
}
