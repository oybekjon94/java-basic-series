package javaBasics01;

public class IntegerDataType_03 {
    public static void main(String[] args) {
        //butun sonlar
        //byte ,short, int, long
        byte num = 1; //byte xotiradan 1 byte joy egallaydi
        System.out.println(num);
        num = 2;
        System.out.println(num);

        //short num2 = 20; error
        //int num2 = 20;
        short num2 = 20;
        System.out.println(num2);
        //num2 = num + 10;
        num2 = 20 + 10;
        System.out.println(num2);

        int million = 1_000_000_00;
        System.out.println(million);
        million = million / 10;  //1 byte + 2byte = 3byte memory <=4
        System.out.println(million);

        //long eng katta son
        long bigNum = 642_864l;
        bigNum = num + num2 + million;//1byte + 2byte + 4 byte = 7byte  memory <= 8
        System.out.println(bigNum);

    }
}
