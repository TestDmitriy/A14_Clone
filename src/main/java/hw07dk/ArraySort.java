package hw07dk;

public class ArraySort {
    public static void main(String[] args)
    {
        int[] arr = {3, 9, 1, 8, 4, 8, 5};

        int n = arr.length;
        //System.out.println(n);

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
}


//great implementation of mine: https://i.ytimg.com/vi/nXrQAAU9Y_8/maxresdefault.jpg
// implementation too https://pbs.twimg.com/media/D4OGSdTXsAAU3E0.jpg
// All Sorting Algorithms in Java: https://stackabuse.com/sorting-algorithms-in-java#sortinginjava
// Algorithms: Quicksort : https://www.youtube.com/watch?v=SLauY6PpjW4