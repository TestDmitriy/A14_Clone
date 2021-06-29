package homework6;

import java.util.Arrays;

public class Task2withFunction {
    public static void main(String[] args) {
        int[] numbers = {3,9,1,8,4,8,5,6};
        for (int n : sort(numbers)) {
            System.out.print(n+", ");
        }
        System.out.println(Arrays.toString(sort(numbers)));
    }
    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}