package javaBasics01;

public class ProductCar {
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.getColor("green");
        mercedes.getModel("Mercedes");

        Car bmw = new Car();
        bmw.getColor("black");
        bmw.getModel("BMW");
        //biz ikkita objectni solishtirganimizda
        //equalsdan foy. ikkita qiymatni esa ==,> etc.
        if (mercedes.equals(bmw)){

        }

    }
}
