package javaBasics01;

public class StringFormatting_08 {
    public static void main(String[] args) {
        int age = 34;
        String name = "William";

        String output = String.format("%s is %d years old", name,age);
        System.out.println(output);
    }
}
