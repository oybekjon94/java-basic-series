package javaBasics3;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

public class Numbers {
    public static void main(String[] args){
        List<Number> ls = new ArrayList<>();

        ls.add(1342341);
        ls.add((float) 34.56);
        ls.add(235.242);

        for (Number n: ls){
            System.out.println(n.getClass());
            System.out.println(n);
        }
    }
}
