package hw08dk;

public class Appz
{

    public static void main(String[] args)
    {

        // object #1
        cpuz pc1 = new cpuz();
        pc1.pcname = "Work";
        pc1.gen = 9;
        pc1.series = "i7";
        pc1.socket = 1151;

        // oblect #2
        cpuz pc2 = new cpuz();
        pc2.pcname = "Game";
        pc2.gen = 10;
        pc2.series = "i9";
        pc2.socket = 1200;

        //call Method
        pc1.pcprint();
        pc2.pcprint();


    }
}
