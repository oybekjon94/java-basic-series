package javaBasics3;

public class IntegerWrapper {
    public static void main(String[] args){
        int a = 55;
        Integer b = a;

        int c = b;
        float d = b.floatValue();

        String bin  = Integer.toBinaryString(a);
        String hex = Integer.toHexString(a);
        String oct = Integer.toOctalString(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(bin);
        System.out.println(hex);
        System.out.println(oct);
    }

}
