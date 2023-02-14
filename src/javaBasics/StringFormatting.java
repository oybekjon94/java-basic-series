package javaBasics;

public class StringFormatting {
    public static void main(String[] args){
        int age = 34;
        String name = "William";
        String output = String.format("%s is %d years old.", name, age);
        //We use the format method of the built-in String class. The %s and %d  are control characters
        // which are later evaluated. The %s accepts string values, the %d integer values.

        System.out.println(output);
    }
}
