package javaBasics01;

import java.util.Scanner;

public class ForExamplestTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //for (int i = 0; i < 10; i++) {
//            if (i != 3 || i == 6){
//                System.out.println(i);
//            }
        //----
        //5ga bolinadigan sonlar
//        for (int i = 1; i < n; i++){
//            if (i % 5 == 0){
//                System.out.println(i);
//            }
//
//        }
        //---------------
        //5ga bolinadigan sonlani yigindisini topish
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 5 == 0){
//                System.out.println(i);
//                sum += i;
//            }
//        }
        //5ga va 3ga bolinadigan sonlani yigindisini topish
//        int sum1 = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 5 == 0 && i % 3 == 0){
//                System.out.println(i);
//                sum1 += i;
//            }
//        }
        //5 yoki 3ga bolinadigan sonlani yigindisini topish
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0 || i % 3 == 0){
                System.out.println(i);
                sum2 += i;
            }
        }
        System.out.println(sum2);
    }
}
