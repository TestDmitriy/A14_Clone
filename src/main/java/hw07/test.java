package hw07;

public class test {
    public static void main(String[] args) {


//------------------------------------------------- TESTING ONLY --------------------------------

//    public static int tstsort ( int[] arroz)

        int[] arroz = {10, 9, 1, 8, 4, 8, 5};

        int dlina = arroz.length;           // длинна массива
        int stepup = 1;                  // для посчета ранга - места
        int newnum = 0;                 // новый Порядковыый номер
        int startid = 0;

        for ( int numer : arroz ) {

            do
            {
                if ( arroz[numer] > arroz[numer + stepup] )
                {
                    //dlina = dlina -1;
                    stepup = stepup + 1;
                }
            }
            while ( dlina > 0);
        }




//            while (dlina > 0 )
//            {
//                for (int arro : arroz)
//                {
//                if (arro > arroz[arro+stepup])
//                {
//                    newnum = newnum + 1;
//                    stepup = stepup + 1;
//                    //dlina = dlina - 1;
//                }
//
//                }
//                dlina = dlina - 1;
//           }

       }
   }

        //System.out.println();







// to print
//        for (int i: testar1
//             ) {
//            System.out.println(i);
//            i = i ++;
//        }



//--------------------------------------------------


