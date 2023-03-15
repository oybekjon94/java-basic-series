package javaBasics01;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int a = scanner.nextInt();

//        if (a < 100){
//            System.out.println("sonimiz 100 dan kichik");
//        }else {
//            System.out.println("sonimiz 100 dan katta");
//        }

//        if(a % 2 == 0){ //har doim qoldiq chiqadi
//            System.out.println(a+"bu sonimiz juft");
//            //agarda 10 kiritsa tepadagi output
//        }else {
//            System.out.println(a+"bu son toq son");
//            //agarda 9 bolsa toq output
//        }

        //nested

        //if (a % 2 >= 1) bu sonni toqligini bilsak boladi
        //if (!(a % 2 == 0)) nullga teng bolmasa degan shart
//        if (a % 2 == 0){
//            if (a % 5 == 0){
//                System.out.println(a+"bu son juft va 5ga bolinadi");
//            }else {
//                System.out.println(a+"bu sonimiz juft lekin 5 ga bolinmaydi");
//            }
//        }else{
//            if (a % 5 == 0){
//                System.out.println(a+"bu sonimiz toq va 5 ga bolinadi");
//            }else {
//                System.out.println(a+"bu sonimiz toq lekin 5 ga bolinmaydi");
//            }
//        }
        System.out.println("grant otish balini kiriting");
        int grandUtishBali = scanner.nextInt();
        System.out.println("kantrakni otish balini kiriting");
        int kantrakUtishBalli = scanner.nextInt();
        int bal = scanner.nextInt();

        if (bal >= grandUtishBali){
            System.out.println("siz grand bilan otdingiz");
        }else if(bal >= kantrakUtishBalli && bal < grandUtishBali){
            System.out.println("siz kantrak asosida kirdingiz");
        }else {
            System.out.println("siz talaba bolmadingiz ");
        }


    }
}
