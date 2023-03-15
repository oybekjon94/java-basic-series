package javaBasics01;

public class OperatorsExample {
    public static void main(String[] args) {
        boolean open = true;
        boolean close = false;

        //not, and, xor, or -> eng kop ishlatiladi
        boolean b = !false;

        boolean b1 = true && true;
        boolean b2 = true && false;
        boolean b3 = false&& true;
        boolean b4 = false && false;

        boolean c1 = true ^ true; //false
        boolean c2 = true ^ false;//true
        boolean c3 = false ^ true;//true
        boolean c4 = false ^ false;//false

        boolean j1 = true || true;
        boolean j2 = true || false;
        boolean j3 = false || true;
        boolean j4 = false || false;

        System.out.println(b);

        boolean b5 = open && !(close || b);
        System.out.println(b5);
    }
}
