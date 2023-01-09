package HackerRank;

public class Subsequence {
    public static void main(String[] args) {
        String s = "hereiamstackerrank";
        System.out.println(test(s));
    }

    public static String test(String s) {
        String hk = "hackerrank";
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < s.length() && pointer2 < hk.length()) {
            if (s.charAt(pointer1) == hk.charAt(pointer2)) {
                pointer2++;
            }
            pointer1++;
        }
        return pointer2 == hk.length() ? "YES" : "NO";
    }
}
