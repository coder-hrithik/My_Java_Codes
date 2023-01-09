package Strings;

public class SpecialChar {
    public static void main(String[] args) {
        String s = "Java4@!56#$";

        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == ' ') {
            } else {
                System.out.print(s.charAt(i) + " ");
            }
        }

    }
}
