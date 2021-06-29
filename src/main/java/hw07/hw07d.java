package hw07;

import jdk.dynalink.beans.StaticClass;

public class hw07d {
    public static void main(String[] args) {

//------------------------------------------------------------ 1:
//        1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//                invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result

        int[] trays = {2, 3, 5, 6, 7, 8};
        int aSum = dSum(trays);
        System.out.println("Task#01: Sum = " + aSum);


//--------------------------------------------------------------- 2:
//        2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main() -
//           pass {3,9,1,8,4,8,5} as a param (this will be void func)

        int[] arrSort = {3, 9, 1, 8, 4, 8, 5};

//        dSort(arrSort);

//        System.out.println("Task#02: Sort = " + dSort(arrSort));


//
//----------------------------------------------------------------- 3:
//       3. Create a function  which takes int[] as a param and returns min of the array invoke it from main() - pass {3,9,1,8,4,8,5} as a param

        int[] arrpass = {3, 9, 1, 8, 4, 8, 5};
        int p = findmin(arrpass);
        System.out.println("Task#03: MIN = " + p);
    }
//---------------------------------------------------------------- FUNCTIONS

        public static int dSum ( int[] drays1)
        {
            int tsum = 0;
            for (int dray : drays1
            ) {
                tsum = tsum + dray;
            }
            return tsum;
        }

//------------------------------------------------------------ 2: Function
//        public static int dSort ( int[] drays)
//        {
//        }
//------------------------------------------------------------- 3: Function: Find MIN in Array

        public static int findmin(int[] dmin)
        {
            int numbers = dmin[0];

            for (int number : dmin) {
                if (number < numbers) {
                    numbers = number;
                }
            }
            return numbers;
        }

}

