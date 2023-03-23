package javaBasics01.Collections;

import javaBasics01.Main;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLesson {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(5,"test5");
        map.put(1,"test1");
        map.put(3,"test3");
        map.put(4,"test4");
        //null qiymat saqlay olaymiz
        //map.put(null,"test");

        //malumotlarni saralab chiqaradi
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"="+m.getValue());
        }
    }
}
