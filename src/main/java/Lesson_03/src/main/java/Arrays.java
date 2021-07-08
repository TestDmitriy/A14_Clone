public class Arrays {
    public static void main(String[] args) {

//HOMEWORK

//        int [] numbs = {2, 76, 9, 90, 31, 76, 21, 12};
//        System.out.println(numbs.length);               // length
//        System.out.println(numbs[1]);                   // index #1

//String[]fruits = new String[8];

        String []words = new String[6];
        words[0] = "One";
        words[1] = "Two";
        words[2] = "Three";
        words[3] = "Four";
        words[4] = "Five";
        words[5] = "Six";

        System.out.println(words.length);
        System.out.println(words[0]);
        System.out.println(words[5]);
        System.out.println(java.util.Arrays.stream(words).count());



    }
}
