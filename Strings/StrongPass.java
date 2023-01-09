package Strings;

import java.util.Scanner;

public class StrongPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isUpper = false, isLower = false, isNumeric = false, isSpecial = false;

        for (int i = 0; i < args.length; i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                isUpper = true;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                isLower = true;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                isNumeric = true;
            } else if (s.charAt(i) == '@' && s.charAt(i) == '#' && s.charAt(i) == '/' && s.charAt(i) == '_'
                    && s.charAt(i) == '+') {
                isSpecial = true;
            }
        }

        if (s.length() >= 8 && isUpper && isLower && isNumeric && isSpecial) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
        sc.close();
    }
}
