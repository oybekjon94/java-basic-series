package javaBasics01.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLesson {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        List<String> list = new ArrayList<>();
        list.add("dddd");


        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("peach");
        //ikkita duplikat malumot saqlamaydi
        hashSet.add("grape");
        hashSet.add("grape");

//        hashSet.forEach(s ->{
//            System.out.println(s);
//        });
        //polemarfizm qilsak
//        Set<String> set = new HashSet<>();
//        set.add()

        //hashSet.remove("grape");

        System.out.println(hashSet);

    }
}
