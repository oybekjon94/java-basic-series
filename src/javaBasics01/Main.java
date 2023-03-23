package javaBasics01;

public class Main {

    public Main() {
        ThisKeyword thisKeyword = new ThisKeyword(this);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(1,"test","test2");
        System.out.println(thisKeyword.lastName);
        thisKeyword.insert();

    }
}
