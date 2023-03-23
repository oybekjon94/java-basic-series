package javaBasics01;

public class MethodOverloading {

    //eng sodda method
    public void display(){
        System.out.println("method1");
    }
    //agar tepadagi bilan bir xil bolsa error boladi
    //shuning parametiriga ozgartirish kiritish kere
    public void display(int a){
        System.out.println("method1"+a);
    }
    public void display(double d){
        System.out.println("method1"+d);
    }
    //endi malumot qaytaradigan qilamiz
    //faqatgina parameterda ikkilik bolsagina xatolik bermaydi
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    //ketma ketligi xar xil bolgan methodlar
    public void sum(int a, int b){
        System.out.println("int method");
    }
    public void sum(long a, long b){
        System.out.println("int method");
    }
    //compile time error beradigan methodlar
    public void sum2(int a, long b){
        System.out.println("int method");
    }
    public void sum2(long a, int b){
        System.out.println("int method");
    }
    public void sum2(long a, short b){
        System.out.println("int method");
    }

    public static void main(String[] args) {
      MethodOverloading lesson = new MethodOverloading();
      lesson.display();
      lesson.display(1);
      lesson.display(1.1);

      lesson.sum(1,3);//int ni chaqiradi
      lesson.sum(1,3);//longni chaqiradi
      //lesson.sum2(1,3);bunda error beradi chunki qaysi biriga borishni bilmaydi
      //lesson.sum2(1l,2);shuning uchun aniq tipini berishimiz kere

      //lesson.sum2(1,2); short boladigan bolsa bu muommoni yecholmaymiz

    }
}
