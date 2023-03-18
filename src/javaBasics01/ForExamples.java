package javaBasics01;

import java.util.Scanner;

public class ForExamples {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        //------------------
        //sonlarni yigindisini topish
        //sonlarni kopaytmasini topish
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
//        for (int i = 0; i <= n; i++) {
//            System.out.println("sum = " + sum + "+"+i );
//            sum = sum + i; //sum += i;
//        }

        //--------------
        for (int i = 1; i <= 10; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
