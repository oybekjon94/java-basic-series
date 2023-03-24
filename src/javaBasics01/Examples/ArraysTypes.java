package javaBasics01.Examples;

import java.util.Arrays;

public class ArraysTypes {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,6,5};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
