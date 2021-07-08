package hw14dk;

import java.util.*;

public class App {
    public static void main(String[] args) {

//      1:Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//               + add 4 elements to each hashmap
//               + try methods  put/replace/remove/get/foreach


        System.out.println("// 1 -------------------------------HashMap---------------------------------");

        Map<String,String> newHashMapStr2 = new HashMap<>();            // String, String

        newHashMapStr2.put("One","Ram");                                //put
        newHashMapStr2.put("Two","Cpu");
        newHashMapStr2.put("Three","Mobo");
        newHashMapStr2.put("Four","Ssd");

        System.out.println(newHashMapStr2);                             //printOut created collection - String

        newHashMapStr2.putIfAbsent("Five","Ram");                       // adding value
        System.out.println(newHashMapStr2);

        System.out.println(newHashMapStr2.get("Two"));                  //printing by Key /Cpu

        System.out.println(newHashMapStr2.entrySet());                  // printing collection - []

        System.out.println(newHashMapStr2.containsKey("Six"));          //contains Key

        System.out.println(newHashMapStr2.containsValue("Cpu"));        //contains value

        System.out.println(newHashMapStr2.keySet());                    // only keys

        System.out.println(newHashMapStr2.getOrDefault("Two","222"));       //Cpu

        System.out.println(newHashMapStr2.containsValue("Mobo"));       // True

//------------------------------------------------------------------

        Map<Integer,String> newHashMapIntStr = new HashMap<>();           //Integer, String

        newHashMapIntStr.put(1,"AA");
        newHashMapIntStr.put(2,"BB");
        newHashMapIntStr.put(3,"CC");
        newHashMapIntStr.put(4,"DD");
        System.out.println(newHashMapIntStr);
        System.out.println(newHashMapIntStr.entrySet());

//---------------------------------------------------------------------

        Map<Object,Object> newHashMapObj2 = new HashMap<>();                // Object, Object
        Objectsd objD1 = new Objectsd("Object#1",new Object());     //Abstract Object
        Objectsd objD2 = new Objectsd("Object#2",new Object());
        Objectsd objD3 = new Objectsd("Object#3",new Object());
        Objectsd objD4 = new Objectsd("Object#4",new Object());

        newHashMapObj2.put(objD1, objD2);
        newHashMapObj2.put(objD3, objD4);

        System.out.println((newHashMapObj2) + " - Abstract Objects");

        objD1.setObj("iAmNewObject1");
        objD2.setObj("iAmNewObject2");
        objD3.setObj("iAmNewObject3");
        objD4.setObj("iAmNewObject4");

//key and values

        System.out.println("Objects ONLY KEYS: " + newHashMapObj2.keySet());
        System.out.println("Objects ONLY VALUES" + newHashMapObj2.values());       // Objects 2,4 - Values

// key and values using Iteration:
        System.out.println("-----------");
        for (Object o : newHashMapObj2.keySet()) System.out.println(o);
        System.out.println("-----------");
        for (Object o : newHashMapObj2.values()) System.out.println(o);




        System.out.println("// 2 -------------------------------HashSet---------------------------------");
//      2:Create 2 HashSet- <String>,  and custom classes <Class1>
//                add 4 elements to each hashset
//                try methods  put/replace/remove/get/foreach

        Set<String> setd1 = new HashSet<>();
        setd1.add("Case");
        setd1.add("Mobo");
        setd1.add("Cpu");
        setd1.add("Ram");

        setd1.remove("Case");                    //remove
        System.out.println(setd1);

        setd1.add("HDD");                           //add
        System.out.println(setd1);

        System.out.println(setd1.isEmpty());        //empty
        System.out.println(setd1.contains("Fan"));  //contains
        System.out.println(setd1.size());           // size 4

//        setd1.clear();                            //clear
//        System.out.println(setd1);

        System.out.println(setd1.toString());       //toString

        System.out.println(setd1.equals(setd1));    //equal to itself just for TESTING

        if (setd1.contains("Cpu")){         //contain
            System.out.println("trued");
        }

    }
}
