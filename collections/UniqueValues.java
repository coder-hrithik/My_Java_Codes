package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueValues {
    public static void main(String[] args) {
        String s = "maharashtra";
        unique(s);
    }

    static void unique(String s) {

        Map<Character, Integer> h = new HashMap<>();
        char[] c = s.toCharArray();

        for (char x : c) {
            if (h.containsKey(x)) {
                h.put(x, h.get(x) + 1);
            } else {
                h.put(x, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = h.entrySet();

        for (Map.Entry<Character, Integer> x : set) {
            if (x.getValue() == 1) {
                System.out.print(x.getKey() + " ");
            }
        }
    }
}
