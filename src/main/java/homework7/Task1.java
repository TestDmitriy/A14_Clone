package homework7;

//Create 2 Enums
//Create 2 Variables of each enum

public class Task1 {
    public static void main(String[] args) {

//        ATMs numbers
        ATMs atmRussia = ATMs.BRU08099;
        ATMs atmHongKong = ATMs.BHK07202;

//        Computers processers
        Processors comp1 = Processors.AMD;
        Processors comp2 = Processors.INTEL;

//        Outputs
        System.out.println("Russia ATM with number "+atmRussia+" has "+comp1+" processor");
        System.out.println("Hong Kong ATM with number "+atmHongKong+" has "+comp2+" processor");
    }
}
