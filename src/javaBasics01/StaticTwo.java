package javaBasics01;

import java.util.Scanner;

public class StaticTwo {
    static int a = 5 ;

    //static block
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
        //pow -> darajaga kotarish
        //Math.pow();

        //static method ichida faqat static ozgaruvchilarni chaqirsa boladi
        a = 7;
        //pastda static deb belgilangani uchun korindi
        //display();

        //agarda static qilib belgilamasdan chaqirsak
        StaticTwo staticTwo = new StaticTwo();
        staticTwo.display();
        int sum = Calculate.sum(3,5);
        System.out.println(sum);
    }

    public void display(){
        System.out.println("static keyword");
    }
}
