package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        System.out.println(colors);
        System.out.println(colors.size());

        System.out.println(colors.get(0));
        String lost = colors.set(1,"Green");
        System.out.println(colors);
        System.out.println(lost);
        colors.add(3,lost);
        System.out.println(colors);

        boolean res = colors.contains("Redish");
        System.out.println(res);
        colors.remove(3);
        System.out.println(colors);
        System.out.println(colors.size());


        List<Integer> numbers = new ArrayList<>();


        List<String> fruits = new ArrayList<>();
        fruits.add("Pineapple");
        fruits.add("Apple");


        List<Person> people = new ArrayList<>();
        if(lost.equals("Red")){
            System.out.println("cool");
        }

        Person x1 = new Person("David");
        Person x2 = new Person("David");
        Person y = x1;

        if (x1==y){
            System.out.println("Hi");
        }
        people.add(x1);
        people.add(x2);
        people.add(new Person("David"));

//        for (String color: colors){
//            System.out.println(color);
//        }

//        colors.forEach(color-> System.out.println(color));

        colors.forEach(System.out::println);
    }
}
