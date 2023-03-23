package javaBasics01;

//static Polimorfizm
public class SampleCalculator {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        SampleCalculator sampleCalculator = new SampleCalculator();
        System.out.println(sampleCalculator.add(2,5));
        System.out.println(sampleCalculator.add(2,5,6));
    }
}
