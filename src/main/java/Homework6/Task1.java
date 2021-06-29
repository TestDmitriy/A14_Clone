package Homework6;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,6,7,8};
        System.out.println(sum(numbers));
    }
    public static int sum(int[] array){
        int total = 0;
        for (int s : array) {
            total = total + s;
        }
        return total+1;
    }
}