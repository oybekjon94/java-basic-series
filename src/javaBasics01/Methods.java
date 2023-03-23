package javaBasics01;

import java.lang.reflect.Method;

public class Methods {
    //1-qiymat qaytaradigan
    //2- qiymat qaytarmaydigan
    //main -> qiymat qaytarmaydi chunki oldida void bor
    //agar oldida void bolmasa bu qiymatqaytarmaydigan method boladi
    //unda return bolishi kere
    public static void main(String[] args) {
        Methods method = new Methods();
        method.getMessage("mohirdev"); //methodni chaqirish usuli
        //agar pastda static bolmasa shu tartibda chaqiriladi
        method.getSum(3,4);

    }
    public void getMessage(String message){
        System.out.println("hello"+ message);
    }
    public int getSum(int a, int b){
        return a+b;
    }
}
