package javaBasics01;

import java.util.Locale;

public class StringDataType {
    public static void main(String[] args) {
        String text = "Hello oybek";
        System.out.println(text);
        String str = null;

        String text1 = new String("Hello wotld");
        System.out.println(text1);
        //tepadagi bilan bir xil .lekin bunisi kam ishlatiladi

        System.out.println(text.length());

        String uppercase = text.toUpperCase();
        String lowercase = text.toLowerCase();

        System.out.println(uppercase);
        System.out.println(lowercase);

        String replace = text.replace("Hello","Salom");
        System.out.println(replace);

        String replace1 = text1.replace("Hello wotld","Helooo");
        System.out.println(replace1);

        String concat = text.concat(" ").concat(text1);
        System.out.println(concat);

        String concat1 = text1 +" "+ text;
        System.out.println(concat1);

        String concat2 = "sfkndv" + 10 + true;
        System.out.println(concat2);

        System.out.println(concat1.equals(concat2));

    }
}
