public class HomeWork {
    public static void main (String[] arg){

        // HOMEWORK
//
//        AND  - &&
//        true && true = true
//        true && false = false
//        false && true = false
//        false && false = false
//
//        OR  - ||
//                true || true = true
//        true || false = true
//        false || true = true
//        false || false = false
//

        byte a = 100;
        byte x = 12;
        byte d = 12;
        byte c = 122;


        //a

        boolean zz1 = a==d;
        System.out.println("a = "+ zz1);

// using variable
// a - false
        boolean aAnswer = (false);

        if (aAnswer == zz1) {
            System.out.println("YES. Answer is Correct");
        }
        else {System.out.println("NO, Answer is INCorrect");
        }

// shorter

        if (zz1 == false) {
            System.out.println("YES. Answer is Correct");
        }
        else {System.out.println("NO, Answer is INCorrect");
        }

// more shorter

        if (zz1 == false) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}


//b - true
        boolean zz2 = x==d;
        System.out.println("b = "+ zz2);

        if (zz2 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

//c - true
        boolean zz3 = c>=a;
        System.out.println("c = "+ zz3);

        if (zz3 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

//d - true

        boolean zz4 = x>=d;
        System.out.println("d = "+ zz4);

        if (zz4 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

//e - true

        boolean zz5 = (d==c) || (x==d);
        System.out.println("e = " + zz5);

        if (zz5 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

//f - true

        boolean zz6 = (c>x) && (d>=x);
        System.out.println("f = " + zz6);

        if (zz6 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

// g - true

        boolean zz7 = (a>x) || (a>c);
        System.out.println("g = " + zz7);

        if (zz7 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

// h - false

        boolean zz8 = (a==c) && (d==c);
        System.out.println("h = " + zz8);

        if (zz8 == false) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

// i - true

        boolean zz9 = (c==c) && (a>=a);
        System.out.println("i = " + zz9);

        if (zz9 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

// j - true

        boolean zz0 = (c>c) || (a<=a);
        System.out.println("j = " + zz0);

        if (zz0 == true) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

// k - false

        boolean zz10 = (x>a) || (c==d);
        System.out.println("k = " + zz10);

        if (zz10 == false) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}

// l - false

        boolean zz11 = (c>a) && (x>d);
        System.out.println("l = " + zz11);

        if (zz11 == false) {System.out.println("YES. Answer is Correct");}
        else {System.out.println("NO, Answer is INCorrect");}








    }
}
