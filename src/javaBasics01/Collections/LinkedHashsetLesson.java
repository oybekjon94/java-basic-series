package javaBasics01.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetLesson {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("peach");
        set.add("watermelon");
        //for usulda chiqarish
        for (String str:set){
            System.out.println(str);
        }

        System.out.println(set);
    }
}
