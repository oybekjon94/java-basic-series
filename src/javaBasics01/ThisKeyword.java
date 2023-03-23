package javaBasics01;

public class ThisKeyword {

    int id;
    String name;
    String lastName;

    public ThisKeyword(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public ThisKeyword() {
        System.out.println("first constructor");
    }
    public ThisKeyword(int a) {
        this();
        System.out.println("second constructor");
    }


    public void update(){
        System.out.println("update");
    }
    public ThisKeyword(Main main){
        System.out.println("main class");
    }
    public void insert(){
        update();
    }
    //ozi turgan methodni argument sifatida bersak boladi.pastdagi
    public void callMethod(ThisKeyword thisKeyword){
        System.out.println("argument the method");
    }
    public void callMethod(){
        callMethod(this);
    }
    ThisKeyword getThisKeyword(){
        return this;
    }

    public static void main(String[] args) {

        ThisKeyword thisKeyword = new ThisKeyword(10);
        thisKeyword.callMethod();
        thisKeyword.getThisKeyword().insert();
    }


}
