package javaBasics01;

import java.util.Scanner;

public class ForExampes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        out:for (int i = 2; i <= n ; i++) {
            for (int j = 2; j <= i-1; j++) {
                //for (int j = 2; j <= i/2; j++) bu optimal yechim
            //-1 bu 11 soni bolsa 10 gacha bajaradi
                if (i % j == 0){
                    continue out;
                    //out bu tashqariga chiqarib yuborish
                    //yani agar teg bolsa boshqa otkazib yuboradi
                }
            }
            System.out.println(i);
            //tub sonlar result boladi
        }
    }
}
