package javaBasics;

import com.sun.source.doctree.SystemPropertyTree;

/*
A literal is a textual representation of a particular value of a type. Literal types include
boolean, integer, floating point, string, null, or character
 */
public class Literals {
    public static void main(String[] args){
        int age = 23;
        String name = "james";
        boolean sng = true;
        String job = null;
        double weight = 68.5;
        char c = 'j';

        System.out.format("his name is %s%n", name);
        System.out.format("his is %d years old%n", age);

        if (sng) {
            System.out.println("he is single");
        }else {
            System.out.println("he is in a relationship");
        }

        System.out.format("his job is %s%n", job);
        System.out.format("he weights %f kilograms%n", weight);
        System.out.format("his name begins with %c%n", c);
    }
}
