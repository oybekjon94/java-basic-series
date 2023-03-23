package javaBasics01;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0; //boshlanish nuqtasi
        //while(false){ agarda false hech qachon skil operatoriga kirmaydi
        //shuning uchun xar doim true boladi
        while(n > i){
            System.out.println(i);
            i++;
        }

    }
}
