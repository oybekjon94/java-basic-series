package javaBasics01;

public class Dog extends Animal {
    public void security(){
        System.out.println("security");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.security();
    }
}
