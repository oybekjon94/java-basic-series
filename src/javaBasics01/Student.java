package javaBasics01;

public class Student {
    int id;
    String name;

    //static ozgaruvchi
    static String college = "TIU";

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student() {
    }
    public void printf(){
        System.out.println(id+" "+name+college);
    }
}
