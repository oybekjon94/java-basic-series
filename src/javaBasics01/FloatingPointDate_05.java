package javaBasics01;

import java.util.Scanner;

public class FloatingPointDate_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        int n1 = scanner.nextInt();
        float f = scanner.nextFloat();
        System.out.println("birinchi son "+ n);
        System.out.println("ikkinchi son "+ n1);
        System.out.println("uchinchi son "+ f);

        //double, float
        double one = 1.0;
        double num = 1.0 + 1;
        System.out.println(num);
        double pi = 3.14566;

        float v = 1.0f;

        double ex = 5e-3;// 5*10^ -3 = 0.005
        System.out.println(ex);
        double ex1 = 0.1e2; //0.1 * 10^ 2 // 10 ning 2 chi darajasi
        System.out.println(ex1);

        double a = 5/4;
        System.out.println(a); //1.0
        double a1 = 5.0/4;
        System.out.println(a1); //1.25 //tugri natija chiqardik


    }
}
