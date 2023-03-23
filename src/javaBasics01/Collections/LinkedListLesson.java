package javaBasics01.Collections;

import java.util.LinkedList;

public class LinkedListLesson {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("grape");
        list.add("peach");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
