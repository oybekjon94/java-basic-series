package javaBasics01;

public class DataType_02 {
    // psvm -> pastdagini chiqarib beradi
    public static void main(String[] args) {
        //butun sonlar
        //a byte degan type oldi a-> -128~127
        byte a = 1;
        // byte a = 128 -> error
        short b = 2;
        int c = 3;
        long d = 4;

        int result = a+b;
        //sout -> pastdagi qatorni chiqarish
        System.out.println(result);

        //haqiqiy sonlar
        float e = 2.1f;
        double f = 45.3;

        //int r = a + e; error
        int r = a + (int)e;//demak intga float solib bolmaydi uni intga ozgartirmasak
        float f1 = a + e; //true demak float int solsak xato bolmaydi

        System.out.println(r); // output: 3

        char g = '1';
        boolean h = true;
    }
}
