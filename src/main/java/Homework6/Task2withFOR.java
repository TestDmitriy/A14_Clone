public class Task2withFOR {
    public static void main(String[] args) {
        int[] arr = {3,9,1,8,4,8,5};
        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                int tmp;
                if (arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}