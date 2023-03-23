package javaBasics01;

import java.util.Scanner;

// bizga 3 son berilgan
//usha sonni eng kattasini chiqarib berishmiz kere
public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (a > b && a> c){
//            System.out.println("a="+a);
//        }else if (b > a && b > c){
//            System.out.println("b="+b);
//        }else if (c > a && c > b ){
//            System.out.println("c="+c);
//        }
        //-----------
        //optimal yechim
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //4 5 1 7 6
        int max = 0;
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
