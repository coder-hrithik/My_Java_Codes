package Strings;

class TwoEquals {
    public static void main(String[] args) {
        String s = "abcde";
        String s1 = "";
        String s2 = "";

        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() / 2) {
                    s1 = s1 + s.charAt(i);
                } else {
                    s2 = s2 + s.charAt(i);
                }
            }
        } else {
            System.out.println("\n cant divide");
        }

        System.out.println(s1 + " " + s2);
    }
}