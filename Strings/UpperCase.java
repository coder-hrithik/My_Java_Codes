package Strings;

public class UpperCase {
    public static void main(String[] args) {
        String s = "Java12";
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char)(c[i] - 32);
            }
        }
        s = new String(c);
        System.out.println(s);
    }
}
