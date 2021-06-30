package hw08dk;

public class App
{

    public static void main(String[] args)
    {
        //#1 object:
        book kniga = new book();
        kniga.bookname ="Misery";
        kniga.year = 1992;
        kniga.authora = "S. King";
        kniga.country = "???";


        //#2 object:
        book knigafree = new book();
        knigafree.bookname = "Java";
        knigafree.year = 2020;
        knigafree.authora = "Baurzhan";
        knigafree.country = "USA";

        // 1st Method Invoke:
        System.out.println("1a: "); kniga.bookinfo();
        //System.out.println("1b: " +knigafree.authora);

        // 2nd Method Invoke + LOOP:
        book[] listd = {kniga, knigafree};
        for ( book i : listd
             ) {
            i.bookinfo();
        }
//--------------------------------------------


    }

}
