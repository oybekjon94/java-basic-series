package javaBasics01.Collections;

import javaBasics01.Main;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLesson {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>map = new LinkedHashMap<>();
        map.put("apple",1);
        map.put(null,2);
        map.put("apple2",3);
        map.put("apple3",4);
        //linkedHashMapda xam boricha chiqaradi
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+ "="+m.getValue());
        }
    }
}
