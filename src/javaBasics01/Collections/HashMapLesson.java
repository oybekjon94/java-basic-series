package javaBasics01.Collections;

import javaBasics01.Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap = new HashMap<>();
        hashMap.put(1,"apple");
        hashMap.put(2,"banana");
        //ikki xil qiymatning bittasini oladi
        hashMap.put(null,"test");
        hashMap.put(null,"test");

        //malumotlarni chiqarish
        for (Map.Entry n:hashMap.entrySet()){
            System.out.println(n.getKey()+ "="+n.getValue());
        }
    }

}
