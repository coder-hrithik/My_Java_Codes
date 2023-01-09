package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            b.append(ch);
        }
        System.out.println(b);
        b.reverse();
        System.out.println(b);
        b.deleteCharAt(11);
        System.out.println(b);
    }
}
