package javaBasics01.Examples;

public class Casting {
    public static void main(String[] args) {
        //Implicit casting
        //byte > short > int > long > float > double
        short x = 1;
        int y = x+2;
        //-----
        double x1 = 1;
        double y1 = x1 + 2;
        //-----
        double x2 = 1.1;
        int y2 = (int)x2 + 2;
        //----
        String x3 = "1";
        int y3 = Integer.parseInt(x3) + 2;
        System.out.println(y);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
    }
}
