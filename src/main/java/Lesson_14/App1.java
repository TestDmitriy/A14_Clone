package Lesson_14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();
        capitals.put("Washington","USA");
        capitals.put("Berlin","Germany");
        capitals.put("Vienna","Austria");
        capitals.put("Beijing","China");
        capitals.put("Tokyo","Japan");
        capitals.put("London","UK");
        String xx = capitals.put("London","Great Britain");
        capitals.put("Osaka","Japan");


//        System.out.println(xx);
//        System.out.println(capitals);

//        System.out.println(capitals.get("Tokyo"));

        Map<Integer,String> likeAList = new HashMap<>();
        likeAList.put(0,"Hammer");
        likeAList.put(1,"Plier");
        likeAList.put(2,"Drill");

        likeAList.remove(1);

//        System.out.println(likeAList.get(2));

//        Set<String> keys = capitals.keySet();
//        for (String k:keys){
//            System.out.println(k);
//        }

//        for (String k:capitals.keySet()){
//            System.out.println(k);
//        }

//        Collection<String> values = capitals.values();
//        for (String v: values){
//            System.out.println(v);
//        }
//        for (String v: capitals.values()){
//            System.out.println(v);
//        }

//        for (Map.Entry<String,String> e: capitals.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

        Map<String,Person> school = new HashMap<>();
        school.put("MathTeacher",new Person("David","Wilson",1985));

        String ln = school.get("MathTeacher").getLastName();
        System.out.println(ln);
    }
}
