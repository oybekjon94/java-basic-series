package javaBasics;

public class CaseSensitiveIdentifiers {
    public static void main(String[] args){

        String name = "Robert";
        String Name = "Julia";

        /*
        Name and name are two different identifiers. In Visual Basic, this would not be possible.
        In this language, variable names are not case sensitive.
         */

        System.out.println(name);
        System.out.println(Name);
    }
}
