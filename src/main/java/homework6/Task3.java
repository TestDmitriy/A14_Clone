package homework6;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {3,9,1,8,4,8,5,6};
        System.out.println(minMethod(numbers));
    }
    public static int minMethod(int[] array){
        int min = array[0];
        for (int a : array) {
            if (a<min){
                min = a;
            }
        }
        return min;
    }
}