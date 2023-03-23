package javaBasics01;

public class ContinueAndBreak {
    public static void main(String[] args) {
        //break
        for (int i = 0; i < 10; i++) { //ichimlik for
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        //continue
        out:for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 4){
                    continue out;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
