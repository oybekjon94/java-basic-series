package javaBasics01;

import java.util.Scanner;

public class ReadLine_06 {
    public static void main(String[] args) {
        System.out.println("write your name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("hello " + name);
    }
}
