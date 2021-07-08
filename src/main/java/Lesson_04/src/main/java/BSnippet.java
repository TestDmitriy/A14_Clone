public class BSnippet {
    public static void main(String[] args) {

//        System.out.println("Hello");
//        System.out.println("Today is a beautiful day");
//        System.out.println("Nice to meet you");
//
//        System.out.println("Hello");
//        System.out.println("Today is a beautiful day");
//        System.out.println("Nice to meet you");
//
//        System.out.println("Hello");
//        System.out.println("Today is a beautiful day");
//        System.out.println("Nice to meet you");
//
//        System.out.println("Hello");
//        System.out.println("Today is a beautiful day");
//        System.out.println("Nice to meet you");

//        for (int i=1; i<=4 ; i=i+1){
//            System.out.println("Hello");
//            System.out.println("Today is a beautiful day");
//            System.out.println("Nice to meet you");
//        }


//        for(int i=0; i<=10; i++){  // i++ ~ i=i+1
//            System.out.println(i);
//        }

        String[]colors = {"Red","Pink","Red","Crimson","Magenta","Orange"};
//
//        for (int i = 0; i< colors.length; i++){
//            System.out.println(colors[i]);
//        }

        String[]fruits = {"Apple","Orange","Fig","Tangerine","Lemon","Lime","Pineapple","Starfruit"};

//        for (int i=0; i< fruits.length;i++){
//            System.out.println(fruits[i]);
//        }

//        for(int i = fruits.length-1;i>=0;i--){
//            System.out.println(fruits[i]);
//        }

//        for (int i = 6; i<=50; i+=2){ // i+=2 ~ i=i+2
//            System.out.println(i);
//        }

//        for(String v : colors){
//            System.out.println(v);
//        }

//        for (String fruit : fruits){
//            System.out.println(fruit);
//        }
        boolean x = true;

//        while (x){
//            System.out.println("in the while loop");
//            x=false;
//        }
//        x=false;
//        do {
//            System.out.println("in the do-while");
//        }while (x);

//        System.out.println(8%3);

        int[]numbers = {1,5,1,34,56,78,4,4,56,2,-9,12,12,4,5,7,9,0,-4,22};

//        for (int number : numbers){
//            if(number%2==0){
//                System.out.println(number);
//            }
//        }
//        for (int number : numbers){
////            if(number%2==1 || number%2==-1){
//            if(number%2!=0){
//                System.out.println(number);
//            }
//        }

        int max = numbers[0];
        for (int n : numbers){
            if(max<n){
                max=n;
            }
        }
        System.out.println("max="+max);

        int min = numbers[0];
        for (int v : numbers){
            if(v<min){
                min=v;
            }
        }
        System.out.println("min="+min);

    }

}