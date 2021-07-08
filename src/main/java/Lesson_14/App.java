package Lesson_14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Pizza");
        set.add("Hero");
        set.add("Red");
        set.add("Apple");
        set.add("Apple");
        set.remove("Red");

        boolean isApple = set.contains("Cucamber");

        System.out.println(isApple);

        System.out.println(set);
        System.out.println(set.size());

        for (String v: set){
            System.out.println(v);
        }
    }
}
