package javaBasics01;

import java.util.Scanner;

public class WhileExample2 {
    public static void main(String[] args) {
        //1234 -> 4321 chiqarish kere
        //yani teskarisini
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        String number = ""; //yani har bitta qoldiqni stringa yigib borish
        while (n > 0){
            int q = n % 10;
            n = n/10;
            number += q;
        }
        System.out.println(number);
    }
}
