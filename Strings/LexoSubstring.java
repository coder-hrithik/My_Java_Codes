package Strings;

import java.util.TreeSet;

public class LexoSubstring {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        int l = s.length();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i <= l - k; i++) {
            set.add(s.substring(i, i + k));
        }
        System.out.println(set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
    }
}
