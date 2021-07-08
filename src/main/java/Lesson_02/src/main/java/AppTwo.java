public class AppTwo {
    public static void main(String[] arg) {
// my code during class
        int age = 20;

        if (age>=21){
            System.out.println("Here is your beer");
        } else {
            System.out.println("No beer for you");
        }

        //BOOLEAN TRUE or FALSE

        boolean xx = 5>10;
        System.out.println("xx = "+xx);


        boolean xx1= 33>33;
        System.out.println(xx1);
        // > bigger
        // >= bigger or equal
        // < smaller
        // <= smaller or equal
        // == equal
        // != not equal

        int passengerAge = 7;

        if (passengerAge > 2 && passengerAge <= 21) {
            System.out.println("you got 50% discount");
        }else if (passengerAge <=2){
            System.out.println("Free ticket");
        }

        boolean ww = (5>10) || (4!=3);
        System.out.println("ww= "+ww);

        int a1=5;
        int a2=5;
        int a3=12;
        int a4=-3;

        boolean aa1 = (a1!=a2) || (a3!=a4);
        System.out.println("aa1 = "+aa1);

        //boolean aa2 =


// Testing *******************************************
        char mLetter = 'D';
        System.out.println(mLetter); // Comments
/* Comments
    Comments too
        Comments again
 */


    }
}
