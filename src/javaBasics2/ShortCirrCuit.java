package javaBasics2;

public class ShortCirrCuit {
    public static boolean One(){
        System.out.println("inside one");
        return false;
    }
    public static boolean Two(){
        System.out.println("inside two");
        return false;
    }
    public static void main(String[] args){
        System.out.println("short circuit");
        if (One() && Two()){
            System.out.println("pass");
        }
        System.out.println("###########");

        if (Two() || One()){
            System.out.println("pass");
        }
    }
}
