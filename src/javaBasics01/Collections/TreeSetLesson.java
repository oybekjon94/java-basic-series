package javaBasics01.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetLesson {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(56);
        set.add(5);
        set.add(-3);
        set.add(23);
        set.add(0);
        //nul saqlab bolmaydi
        //set.add(null);
        System.out.println(set);
        //eng katta va kichik qiymatni olib beradi
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        //malumotlarni kamatish tartibida chiqarib beradi
        System.out.println(set.descendingSet());

        //eski java versiyalari uchun ekranga chiqarish
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
