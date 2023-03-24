package javaBasics01.Examples;

import java.awt.*;

/*
We use primitive types for storing simple values
and reference types for storing complex objects
 */
public class PrimitiveAndReference {
    public static void main(StringType[] args) {
//        byte x = 1;
//        byte y = 1;
//        x = 2;
//        System.out.println(y);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }

}
