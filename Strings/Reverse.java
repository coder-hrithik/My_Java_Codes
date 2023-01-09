package Strings;

public class Reverse {
    public static void main(String[] args) {
        String s = "apple";
        String rev = "";

        for (int i = s.length() - 1 ; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
