package lesson15;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int[]c = {1,2,1};

        System.out.println("Before try/catch block");
        try{
            System.out.println("Before exception");
            int x = a/b;
//            c[5]=10;
//            throw new IllegalArgumentException("XXXX");

            System.out.println("After exception");

        } catch (ArithmeticException err){
            System.out.println("In the catch block");
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("In the second catch block");
        } catch (Exception err){
            System.out.println("Catch every exception");
        } finally {
            System.out.println("Run in any case");
        }

        System.out.println("After try/catch");
    }
}
