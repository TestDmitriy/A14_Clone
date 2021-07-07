package hw07dk;

public class App {

    public static void main(String[] args) {

// HOMEWORK LESSON #06 (ENUMS)

//       1. Create 2 Enums --------------------------------

        Enums_1 in = Enums_1.I3;
        System.out.println("enum: " + in);

//       2. Create 2 Variables of each enum ---------------

        Enums_1 q1 = Enums_1.I9;
        Enums_1 q2 = Enums_1.I5;

        Enums_1[] intel = {Enums_1.I3, Enums_1.I5, Enums_1.I7, Enums_1.I9};
        for (Enums_1 dd : intel)
        {
            System.out.println(dd);
        }

// HOMEWORK LESSON #06 (FUNCTIONS)
//
//------------------------------------------------------------ 1:
//        1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//                invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result

        int[] trays = {2, 3, 5, 6, 7, 8};
        int aSum = dSum(trays);
        System.out.println("Task#01: Sum = " + aSum);

//--------------------------------------------------------------- 2:
//        2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main() -
//           pass {3,9,1,8,4,8,5} as a param (this will be void func)
//
        {
            int[] arr = {3, 9, 1, 8, 4, 8, 5};

            int n = arr.length;
            System.out.println("Task #03: Sort");


            for ( int i = 0; i <= (n-1); i++ )
            {

                int minindx = i;

                for ( int j = i+1; j < n; j++ )
                {

                    if ( arr[j] < arr[minindx] )
                    {
                        minindx = j;
                    }

                    int temp = arr[minindx];            //SWAP
                    arr[minindx] = arr[i];
                    arr[i] = temp;

                }
                System.out.println(i +" : "+ arr[i]);
            }



        }

//----------------------------------------------------------------- 3:
//       3. Create a function  which takes int[] as a param and returns min of the array invoke it from main() - pass {3,9,1,8,4,8,5} as a param

        int[] arrpass = {3, 9, 1, 8, 4, 8, 5};
        int p = findmin(arrpass);
        System.out.println("Task#03: MIN = " + p);
    }
//---------------------------------------------------------------- FUNCTIONS TO CALL

    public static int dSum ( int[] drays1)
    {
        int tsum = 0;
        for (int dray : drays1
        ) {
            tsum = tsum + dray;
        }
        return tsum;
    }

//------------------------------------------------------------- 2: Function
//great implementation of mine: https://i.ytimg.com/vi/nXrQAAU9Y_8/maxresdefault.jpg
// implementation too https://pbs.twimg.com/media/D4OGSdTXsAAU3E0.jpg
// All Sorting Algorithms in Java: https://stackabuse.com/sorting-algorithms-in-java#sortinginjava
// Algorithms: Quicksort : https://www.youtube.com/watch?v=SLauY6PpjW4
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
