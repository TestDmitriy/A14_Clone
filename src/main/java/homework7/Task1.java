package homework7;

//Create 2 Enums
//Create 2 Variables of each enum

public class Task1 {
    public static void main(String[] args) {
        ATMs atmRussia = ATMs.BRU08099;
        ATMs atmHongKong = ATMs.BHK07202;

        Processors comp1 = Processors.AMD;
        Processors comp2 = Processors.INTEL;

        System.out.println("Russia ATM number is "+atmRussia);
        System.out.println("Hong Kong ATM number is "+atmHongKong);
        System.out.println("Computer 1 has "+comp1+" processor");
        System.out.println("Computer 2 has "+comp2+" processor");
    }
}
