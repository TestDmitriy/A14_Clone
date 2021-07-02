package hw08dk;

public class Core {

    public String pc_name;
    public int gen;                         //9,10
    public String series;                   // i3,i5,i7,i9
    public int socket;                      // 1150, 1151, 1200

    public void pc_print()
    {
        System.out.println("Configuration: " +pc_name+ " : " +gen+" : " +series+ " : " +socket );
    }

}
