package javaBasics01;

public class Bike extends Vehicle{
    public void run(){
        System.out.println("bike running");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
        Vehicle vehicle = new Bike();
        vehicle.run();
    }

}
