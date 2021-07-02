package hw08dk;

public class App
{

    public static void main(String[] args)
    {

// -----------------------------------------1

        //#1 object:
        Books kniga = new Books();
        kniga.book_name ="Misery";
        kniga.year = 1992;
        kniga.writer = "S. King";
        kniga.country = "???";


        //#2 object:
        Books knigafree = new Books();
        knigafree.book_name = "Java";
        knigafree.year = 2020;
        knigafree.writer = "Baurzhan";
        knigafree.country = "USA";

        // 1st Method Invoke:
        System.out.println("1a: "); kniga.book_info();
        //System.out.println("1b: " +knigafree.authora);

        // 2nd Method Invoke + LOOP:
        Books[] listd = {kniga, knigafree};
        for ( Books i : listd
             ) {
            i.book_info();
        }
//-------------------------------------------- 2

        // object #1
        Core pc1 = new Core();
        pc1.pc_name = "Work";
        pc1.gen = 9;
        pc1.series = "i7";
        pc1.socket = 1151;

        // oblect #2
        Core pc2 = new Core();
        pc2.pc_name = "Game";
        pc2.gen = 10;
        pc2.series = "i9";
        pc2.socket = 1200;

        //call Method
        pc1.pc_print();
        pc2.pc_print();


    }

}
