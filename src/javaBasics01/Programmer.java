package javaBasics01;

public class Programmer extends Employee {
    int bonus = salary * 2;

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.bonus);
    }

}
