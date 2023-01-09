package HackerRank;

import java.util.HashSet;
import java.util.Set;


public class Pangrams {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";

        s = s.toLowerCase();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                set.add((int )s.charAt(i));
            }
        }
        System.out.println(set);
        
        System.out.println(set.size() == 26 ? "pangram" : "not pangram");
    }
}
