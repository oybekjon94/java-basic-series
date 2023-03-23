package javaBasics01;

public class Lion extends Cat{
    public void king() {
        System.out.println("king");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.hunter();
        lion.king();
    }
}
