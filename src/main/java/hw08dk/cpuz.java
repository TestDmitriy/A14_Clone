package hw08dk;

public class cpuz {

    public String pcname;
    public int gen;                         //9,10
    public String series;                   // i3,i5,i7,i9
    public int socket;                      // 1150, 1151, 1200

    public void pcprint()
    {
        System.out.println("Configuration: " + pcname + " : " +gen+" : " +series+ " : " +socket );
    }

}
