public class F1Homework {
    public static void main(String[] args) {

//      FUNCTIONS PART 1
//-----------------------------------------------------SUMM A
        sumA( 21, 34 );
        sumA( 76, 87 );
        sumA( 15, 31 );

//------------------------------------------------------SUMM B
        int resa = sumB(11,45);
        System.out.println(resa);

        int ress = sumB(3,4);
        System.out.println(ress);

        int res = sumB(13,43);
        System.out.println(res);

//------------------------------------------------------EVEN/ODD

        int[] boxx = {1, -56, 3, 5, -71, 9, 2, 50, 24, 22, 78, 55};
        for ( int box : boxx
             ) { isEven( box );
        }
        //int zz = 66;
        //isEven(zz);
    }

    //------------------------------------------------------------// VOID : NO RETURN
    static void sumA(int s1, int s2) {
        System.out.println("task #01: " + (s1 + s2));
    }

    //-------------------------------------------------------------// WITH RETURN
    static int sumB(int aa, int bb) {
        // int res = (aa + bb);
        // return res;
        return aa + bb;
    }

    //--------------------------------------------------------------//EVEN_ODD
    static void isEven(int z) {
        boolean res;
        if (z % 2 == 0) {
            res = true;
            //System.out.println(res);
            System.out.println("Argument "+ z + " is EVEN " + res);
        } else {
            res = false;
            System.out.println("Argument "+ z + " is ODD " + res);
        }
    }

}



