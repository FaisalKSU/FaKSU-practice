package dataStructures;

import java.util.*;

public class Maps {

    public static void main(String[] args){
        //implement map interfaces

        Map<Integer,String> hMap = new LinkedHashMap<Integer, String>();
        mapUtil(hMap);
    }

    public static void mapUtil(Map<Integer,String> map){
        //1. add Key-value pairs
        map.put(101,"Steve");
        map.put(502,"Roger");
        map.put(22,"Jennifer");
        map.put(315, "Mika");
        map.put(715,"Kelly");

        //2. expose / access elements
        System.out.println("see all the keys: " + map.keySet());
        System.out.println("see all key-value pairs: " + map);
        System.out.println(map.get(502));

        //3. Iterate through map of key-value pairs?

        for(int key : map.keySet()){
            System.out.println("[ " + key + " Value: " + map.get(key) + " ]");
        }

    }
}
