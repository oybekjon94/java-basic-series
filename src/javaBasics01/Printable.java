package javaBasics01;

public interface Printable {
    int MIN = 5;
    void print(); //method

    default void msg(){
        System.out.println("hello msg");
    }

    static int sum(int a, int b){
        return a + b;
    }

    private  void test(){
        System.out.println("test");
    }

}
