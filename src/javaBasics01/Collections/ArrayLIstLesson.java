package javaBasics01.Collections;

import java.util.ArrayList;

public class ArrayLIstLesson {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("banana");
//        list.add("grape");
//        //remove qiladi
//        list.remove("grape");
//
//        //saralangan xolatda chiqaradi
//        Collections.sort(list);
////        1-usul
////        for (int i = 0; i < list.size(); i++) {
////            System.out.println(list);
////        }
//        //2-usul
////        for (String s:list){
////            System.out.println(s);
////        }
//        //3-usul
//        list.forEach(s ->{
//            System.out.println(s);
//        });

        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student(1l,"test","test");
        Student student1 = new Student(2l,"test2","test2");
        Student student2 = new Student(3l,"tes3","test3");

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.forEach(student3 -> {
            System.out.println(student3.getId());
            System.out.println(student3.getName());
            System.out.println(student3.getLastName());
        });
    }
}
