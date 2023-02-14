package javaBasics;

import java.util.Scanner;

public class Readline {
    public static void main(String[] args) {
        System.out.print("Write your name:");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello "+ name);
    }
}
