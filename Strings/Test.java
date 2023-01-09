package Strings;

public class Test {
    public static void main(String[] args) {
        String a = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            a = ch + a ;
        }
        System.out.println(a);
    }
}
