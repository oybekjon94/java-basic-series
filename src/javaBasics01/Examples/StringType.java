package javaBasics01.Examples;

import java.util.Locale;

public class StringType {
    public static void main(String[] args) {
        String message = "  Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!","*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
    }
}
