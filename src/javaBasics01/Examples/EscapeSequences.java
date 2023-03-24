package javaBasics01.Examples;

public class EscapeSequences {
    public static void main(String[] args) {
        String message = "Hello \"Mosh\"";
        System.out.println(message);
        // c:\Windows\...
        String message1 = "c:\\Windows\\...";
        String message2 = "c:\nWindows\\...";
        String message3 = "c:\tWindows\\...";
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
    }
}
