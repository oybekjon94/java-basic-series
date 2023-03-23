package javaBasics01;

public class Counter {
    //agarda static qilmasak xotiradan 3 ta joy egallaydi
    //static qiladigan bolsak xotiradan bitta joy egallab faqat pastdagi
    // countga tasir qiladi
    static int count = 0;

    public Counter() {
        count++;
        System.out.println(count);
    }
}
