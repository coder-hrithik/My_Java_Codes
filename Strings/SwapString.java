package Strings;

public class SwapString {
    public static void main(String[] args) {
        String a = "hello";
        String b = "bye";

        a = a.concat(b);
        System.out.println(a);
        b = a.substring(0, a.length() - b.length());
        System.out.println(b);
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println("////////////");

        System.out.println(a);
        System.out.println(b);
    }
}
