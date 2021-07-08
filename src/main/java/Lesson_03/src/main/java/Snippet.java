public class Snippet {
    public static void main(String[] args) {
        int x = 5;
        x=4;

        int[]june22temps = {73,72,63,62};
//        System.out.println("6am = "+june22temps[0]);
//        System.out.println("12pm = "+june22temps[1]);
//        System.out.println("6pm = "+june22temps[2]);
//        System.out.println("12am = "+june22temps[3]);

        june22temps[1] = 82;
        june22temps[2] = 79;
        june22temps[3] = 71;

//        System.out.println("6am = "+june22temps[0]);
//        System.out.println("12pm = "+june22temps[1]);
//        System.out.println("6pm = "+june22temps[2]);
//        System.out.println("12am = "+june22temps[3]);

        String[] cars = {"BMW","Toyota","Honda","Toyota","Chevrolet"};
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);
//        System.out.println(cars[3]);
//        System.out.println(cars[4]);

        String[]colors = {"Red","Red","Green","Green","Pink","Violet","Yellow"};
//        System.out.println(colors[6]);
//        System.out.println(cars[2]);
        colors[1]="Magenta";
//        System.out.println(colors[1]);
        String[]row1 = {"John","Mary","Jack","Dora","David","Samantha","Evan","Mary","Helen","Samuel"};
        row1[2]="Helga";

        String[]fruits = new String[8];
        fruits[0] = "Orange";
        fruits[1] = "Orange";
        fruits[2] = "";
        fruits[3] = "Apple";
        fruits[4] = "Peach";
//        System.out.println(fruits[2]);
//        System.out.println(fruits[4]);
        fruits[7] = "Pineapple";

//        System.out.println(fruits.length);
//        System.out.println(row1.length);
//        System.out.println(row1[row1.length-1]);
//        System.out.println(colors[colors.length-1]);
//        System.out.println(cars[cars.length-1]);

        int[]numbers = {1,2,1,4,12,4,2,5,6,4,2,4,5,34,4,435,67,44,867,8,8,9,789,4,4,90,890,89,0,89,-6,-90,-9,0,44};
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length-1]);


        boolean[] xx = {true,false,false,5>6,4!=4, 5>1,5!=3};

    }
}