package Strings;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";

        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            sort(c1);
            sort(c2);
            boolean b = true;
            for (int i = 0; i < c2.length; i++) {
                if (c1[i] != c2[i]) {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                System.out.println("Its an anagram");
            } else {
                System.out.println("Not an anagram");
            }

        } else {
            System.out.println("Not an anagrma");
        }
    }

    private static void sort(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

    }
}
