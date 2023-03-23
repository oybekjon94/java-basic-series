package javaBasics01;

public class Problem9 {
    public static void main(String[] args) {
         Problem9 problem9 = new Problem9();
        System.out.println(problem9.isPalindrome(121));
    }
    public boolean isPalindrome(int x){
        int temp = x;
        int reverseNum = 0;
        while (x > 0){
            int d = x % 10;
            x = x/10;
            reverseNum = reverseNum * 10 + d;
        }
        return reverseNum == temp;
    }
}
