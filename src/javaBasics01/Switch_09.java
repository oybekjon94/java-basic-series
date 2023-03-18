package javaBasics01;

import java.util.Scanner;

public class Switch_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  int day = scanner.nextInt();
        String text = scanner.next();
        switch (text){
            case "A":
                System.out.println("a1");break;
            case "B":
                System.out.println("b1");break;
            case "C":
                System.out.println("c1");break;
            default:{
                System.out.println("error");
            }
        }

        //if
//        if (day == 1){
//            System.out.println("dushanba");
//        }else if (day == 2){
//            System.out.println("seshanba");
//        } else if (day == 3) {
//            System.out.println("chorshanba");
//        }else {
//            System.out.println("bunday kun yoq");
//        }

        //switch
//        switch (day) {
//            case 1:
//                System.out.println("dushanba");
//                break;
//            case 2:
//                System.out.println("seshanba");
//                break;
//            case 3:
//                System.out.println("chorshanba");
//                break;
//            case 4:
//                System.out.println("payshanba");
//                break;
//            case 5:
//                System.out.println("juma");
//                break;
//            case 6:
//                System.out.println("shanba");
//                break;
//            case 7:
//                System.out.println("yakshanba");
//                break;
//            default: {
//                System.out.println("bunday kun yoq");
//            }
//        }

//        switch (day){
//            case 1,2,12:
//                System.out.println("qish");break;
//            case 3,4,5:
//                System.out.println("baxor");break;
//            case 6,7,8:
//                System.out.println("yoz");break;
//            case 9,10,11:
//                System.out.println("kuz");break;
//            default:{
//                System.out.println("bunday kun yoq");
//            }
//        }

    }
}
