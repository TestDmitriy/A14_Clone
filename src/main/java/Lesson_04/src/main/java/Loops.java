public class Loops {
    public static void main(String[] args) {

        // LOOPS

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }

//------------------------------------------------------------------

//        for ( int i = 3; i>=0; i=i-1) {
//        System.out.println(i);
//        }

//-------------------------------------------------------------------

//        String[] darr = new String[]{"A","B","C"};
//        System.out.println(darr.length);

//        int[] digs = {4,-2,67,87,-3,0,5,-6,8,11,-78};
//        for (int dig : digs ) {
//            System.out.println(dig);
//        }

//----------------------------------------------------------------------
//        boolean[] boobs = {true,false,false,5>6,4!=4, 5>1,5!=3};
//        for (boolean boob : boobs )
//        {
//            System.out.println(boob);
//        }

//---------------------------------------------------------------------
        int[] dars = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
//        int min = dars[0];
//        for (int dar : dars) {
//            if (dar < min)
//                min = dar;
//        }
//        System.out.println("Min - " + min);
//    }
//}

//        int max = dars[0];
//        for ( int dar : dars) {
//            if (dar > max)
//                max = dar;

//c.        if (dar%3==0 ){

//odd       if (dar%2 !=0){
//b. even      if (dar%2==0){
        //System.out.println(dar);
        //  }
        //System.out.println("Max - " + max);


//a
//        for (int dar:dars
//             ) {
//          System.out.println(dar);
//        }


// -----------------------------------------------------

//        int[] task = {10,15,12,7,88,10,6,17,23,10,10,16};
//        int cnt = 0;
//        for ( int tas : task
//             ) {
//            if (tas==10) {
//                System.out.println("index is: " + (cnt));
//                cnt = ++cnt;
//            } else {
//                cnt = ++cnt;
//            }
//        }


// -------------------------------------------------------
// another student code

        int[] numbers = {10,15,12,7,88,10,6,17,23,10,10,16};
        int v = -1;
        for (int number : numbers){
            v++;
            if (number==10) {
                System.out.println(v);
            }
        }

    }
}