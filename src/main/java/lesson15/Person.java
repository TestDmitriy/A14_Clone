package lesson15;

public class Person {
    private String name;
    private static String xx;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void hello(){
        System.out.println("hello - object - static1");
        System.out.println(xx);
    }
    public void hey(){
        System.out.println(this.name);
        System.out.println(xx);
        hello();
    }
    public void setXx(String x){
        xx=x;
    }
    public String getXx(){
        return xx;
    }
}
