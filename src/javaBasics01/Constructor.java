package javaBasics01;


public class Constructor {
    int id;
    String name;
    public Constructor() {
        System.out.println("hello");

    }
    public Constructor(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
       Student student1 = new Student(1,"test");
       student1.printf();
    }
}
